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

@Tag("33")
class Record_4746 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4746: FirstName is Blanca")
	void FirstNameOfRecord4746() {
		assertEquals("Blanca", customers.get(4745).getFirstName());
	}

	@Test
	@DisplayName("Record 4746: LastName is Lipp")
	void LastNameOfRecord4746() {
		assertEquals("Lipp", customers.get(4745).getLastName());
	}

	@Test
	@DisplayName("Record 4746: Company is M Miller & Son")
	void CompanyOfRecord4746() {
		assertEquals("M Miller & Son", customers.get(4745).getCompany());
	}

	@Test
	@DisplayName("Record 4746: Address is 9666 Owensmouth Ave  #-a")
	void AddressOfRecord4746() {
		assertEquals("9666 Owensmouth Ave  #-a", customers.get(4745).getAddress());
	}

	@Test
	@DisplayName("Record 4746: City is Chatsworth")
	void CityOfRecord4746() {
		assertEquals("Chatsworth", customers.get(4745).getCity());
	}

	@Test
	@DisplayName("Record 4746: County is Los Angeles")
	void CountyOfRecord4746() {
		assertEquals("Los Angeles", customers.get(4745).getCounty());
	}

	@Test
	@DisplayName("Record 4746: State is CA")
	void StateOfRecord4746() {
		assertEquals("CA", customers.get(4745).getState());
	}

	@Test
	@DisplayName("Record 4746: ZIP is 91311")
	void ZIPOfRecord4746() {
		assertEquals("91311", customers.get(4745).getZIP());
	}

	@Test
	@DisplayName("Record 4746: Phone is 818-700-2619")
	void PhoneOfRecord4746() {
		assertEquals("818-700-2619", customers.get(4745).getPhone());
	}

	@Test
	@DisplayName("Record 4746: Fax is 818-700-4043")
	void FaxOfRecord4746() {
		assertEquals("818-700-4043", customers.get(4745).getFax());
	}

	@Test
	@DisplayName("Record 4746: Email is blanca@lipp.com")
	void EmailOfRecord4746() {
		assertEquals("blanca@lipp.com", customers.get(4745).getEmail());
	}

	@Test
	@DisplayName("Record 4746: Web is http://www.blancalipp.com")
	void WebOfRecord4746() {
		assertEquals("http://www.blancalipp.com", customers.get(4745).getWeb());
	}
}
