package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("44")
class Record_4899 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4899: FirstName is Mohammad")
	void FirstNameOfRecord4899() {
		assertEquals("Mohammad", customers.get(4898).getFirstName());
	}

	@Test
	@DisplayName("Record 4899: LastName is Hillen")
	void LastNameOfRecord4899() {
		assertEquals("Hillen", customers.get(4898).getLastName());
	}

	@Test
	@DisplayName("Record 4899: Company is Torch Operating Co")
	void CompanyOfRecord4899() {
		assertEquals("Torch Operating Co", customers.get(4898).getCompany());
	}

	@Test
	@DisplayName("Record 4899: Address is 18002 15th Ave Ne  #-b")
	void AddressOfRecord4899() {
		assertEquals("18002 15th Ave Ne  #-b", customers.get(4898).getAddress());
	}

	@Test
	@DisplayName("Record 4899: City is Seattle")
	void CityOfRecord4899() {
		assertEquals("Seattle", customers.get(4898).getCity());
	}

	@Test
	@DisplayName("Record 4899: County is King")
	void CountyOfRecord4899() {
		assertEquals("King", customers.get(4898).getCounty());
	}

	@Test
	@DisplayName("Record 4899: State is WA")
	void StateOfRecord4899() {
		assertEquals("WA", customers.get(4898).getState());
	}

	@Test
	@DisplayName("Record 4899: ZIP is 98155")
	void ZIPOfRecord4899() {
		assertEquals("98155", customers.get(4898).getZIP());
	}

	@Test
	@DisplayName("Record 4899: Phone is 206-368-6091")
	void PhoneOfRecord4899() {
		assertEquals("206-368-6091", customers.get(4898).getPhone());
	}

	@Test
	@DisplayName("Record 4899: Fax is 206-368-0789")
	void FaxOfRecord4899() {
		assertEquals("206-368-0789", customers.get(4898).getFax());
	}

	@Test
	@DisplayName("Record 4899: Email is mohammad@hillen.com")
	void EmailOfRecord4899() {
		assertEquals("mohammad@hillen.com", customers.get(4898).getEmail());
	}

	@Test
	@DisplayName("Record 4899: Web is http://www.mohammadhillen.com")
	void WebOfRecord4899() {
		assertEquals("http://www.mohammadhillen.com", customers.get(4898).getWeb());
	}
}
