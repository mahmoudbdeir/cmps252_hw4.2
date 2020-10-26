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

@Tag("45")
class Record_3797 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3797: FirstName is Ross")
	void FirstNameOfRecord3797() {
		assertEquals("Ross", customers.get(3796).getFirstName());
	}

	@Test
	@DisplayName("Record 3797: LastName is Coggin")
	void LastNameOfRecord3797() {
		assertEquals("Coggin", customers.get(3796).getLastName());
	}

	@Test
	@DisplayName("Record 3797: Company is Brian L Fox Attorney At Law")
	void CompanyOfRecord3797() {
		assertEquals("Brian L Fox Attorney At Law", customers.get(3796).getCompany());
	}

	@Test
	@DisplayName("Record 3797: Address is 222 Wall St")
	void AddressOfRecord3797() {
		assertEquals("222 Wall St", customers.get(3796).getAddress());
	}

	@Test
	@DisplayName("Record 3797: City is Seattle")
	void CityOfRecord3797() {
		assertEquals("Seattle", customers.get(3796).getCity());
	}

	@Test
	@DisplayName("Record 3797: County is King")
	void CountyOfRecord3797() {
		assertEquals("King", customers.get(3796).getCounty());
	}

	@Test
	@DisplayName("Record 3797: State is WA")
	void StateOfRecord3797() {
		assertEquals("WA", customers.get(3796).getState());
	}

	@Test
	@DisplayName("Record 3797: ZIP is 98121")
	void ZIPOfRecord3797() {
		assertEquals("98121", customers.get(3796).getZIP());
	}

	@Test
	@DisplayName("Record 3797: Phone is 206-443-8793")
	void PhoneOfRecord3797() {
		assertEquals("206-443-8793", customers.get(3796).getPhone());
	}

	@Test
	@DisplayName("Record 3797: Fax is 206-443-8015")
	void FaxOfRecord3797() {
		assertEquals("206-443-8015", customers.get(3796).getFax());
	}

	@Test
	@DisplayName("Record 3797: Email is ross@coggin.com")
	void EmailOfRecord3797() {
		assertEquals("ross@coggin.com", customers.get(3796).getEmail());
	}

	@Test
	@DisplayName("Record 3797: Web is http://www.rosscoggin.com")
	void WebOfRecord3797() {
		assertEquals("http://www.rosscoggin.com", customers.get(3796).getWeb());
	}
}
