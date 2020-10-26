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

@Tag("17")
class Record_3955 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3955: FirstName is Brice")
	void FirstNameOfRecord3955() {
		assertEquals("Brice", customers.get(3954).getFirstName());
	}

	@Test
	@DisplayName("Record 3955: LastName is Fraize")
	void LastNameOfRecord3955() {
		assertEquals("Fraize", customers.get(3954).getLastName());
	}

	@Test
	@DisplayName("Record 3955: Company is Darling Special Products Inc")
	void CompanyOfRecord3955() {
		assertEquals("Darling Special Products Inc", customers.get(3954).getCompany());
	}

	@Test
	@DisplayName("Record 3955: Address is 31 S Main")
	void AddressOfRecord3955() {
		assertEquals("31 S Main", customers.get(3954).getAddress());
	}

	@Test
	@DisplayName("Record 3955: City is Aberdeen")
	void CityOfRecord3955() {
		assertEquals("Aberdeen", customers.get(3954).getCity());
	}

	@Test
	@DisplayName("Record 3955: County is Bingham")
	void CountyOfRecord3955() {
		assertEquals("Bingham", customers.get(3954).getCounty());
	}

	@Test
	@DisplayName("Record 3955: State is ID")
	void StateOfRecord3955() {
		assertEquals("ID", customers.get(3954).getState());
	}

	@Test
	@DisplayName("Record 3955: ZIP is 83210")
	void ZIPOfRecord3955() {
		assertEquals("83210", customers.get(3954).getZIP());
	}

	@Test
	@DisplayName("Record 3955: Phone is 208-226-1411")
	void PhoneOfRecord3955() {
		assertEquals("208-226-1411", customers.get(3954).getPhone());
	}

	@Test
	@DisplayName("Record 3955: Fax is 208-226-8024")
	void FaxOfRecord3955() {
		assertEquals("208-226-8024", customers.get(3954).getFax());
	}

	@Test
	@DisplayName("Record 3955: Email is brice@fraize.com")
	void EmailOfRecord3955() {
		assertEquals("brice@fraize.com", customers.get(3954).getEmail());
	}

	@Test
	@DisplayName("Record 3955: Web is http://www.bricefraize.com")
	void WebOfRecord3955() {
		assertEquals("http://www.bricefraize.com", customers.get(3954).getWeb());
	}
}
