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

@Tag("6")
class Record_934 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 934: FirstName is Deshawn")
	void FirstNameOfRecord934() {
		assertEquals("Deshawn", customers.get(933).getFirstName());
	}

	@Test
	@DisplayName("Record 934: LastName is Corpe")
	void LastNameOfRecord934() {
		assertEquals("Corpe", customers.get(933).getLastName());
	}

	@Test
	@DisplayName("Record 934: Company is Jm Asphalt Co Inc")
	void CompanyOfRecord934() {
		assertEquals("Jm Asphalt Co Inc", customers.get(933).getCompany());
	}

	@Test
	@DisplayName("Record 934: Address is 21250 Box Springs Rd")
	void AddressOfRecord934() {
		assertEquals("21250 Box Springs Rd", customers.get(933).getAddress());
	}

	@Test
	@DisplayName("Record 934: City is Moreno Valley")
	void CityOfRecord934() {
		assertEquals("Moreno Valley", customers.get(933).getCity());
	}

	@Test
	@DisplayName("Record 934: County is Riverside")
	void CountyOfRecord934() {
		assertEquals("Riverside", customers.get(933).getCounty());
	}

	@Test
	@DisplayName("Record 934: State is CA")
	void StateOfRecord934() {
		assertEquals("CA", customers.get(933).getState());
	}

	@Test
	@DisplayName("Record 934: ZIP is 92557")
	void ZIPOfRecord934() {
		assertEquals("92557", customers.get(933).getZIP());
	}

	@Test
	@DisplayName("Record 934: Phone is 951-788-3324")
	void PhoneOfRecord934() {
		assertEquals("951-788-3324", customers.get(933).getPhone());
	}

	@Test
	@DisplayName("Record 934: Fax is 951-788-5732")
	void FaxOfRecord934() {
		assertEquals("951-788-5732", customers.get(933).getFax());
	}

	@Test
	@DisplayName("Record 934: Email is deshawn@corpe.com")
	void EmailOfRecord934() {
		assertEquals("deshawn@corpe.com", customers.get(933).getEmail());
	}

	@Test
	@DisplayName("Record 934: Web is http://www.deshawncorpe.com")
	void WebOfRecord934() {
		assertEquals("http://www.deshawncorpe.com", customers.get(933).getWeb());
	}
}
