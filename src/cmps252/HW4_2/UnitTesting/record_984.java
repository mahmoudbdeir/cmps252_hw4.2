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

@Tag("21")
class Record_984 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 984: FirstName is Jacques")
	void FirstNameOfRecord984() {
		assertEquals("Jacques", customers.get(983).getFirstName());
	}

	@Test
	@DisplayName("Record 984: LastName is Aagaard")
	void LastNameOfRecord984() {
		assertEquals("Aagaard", customers.get(983).getLastName());
	}

	@Test
	@DisplayName("Record 984: Company is Holiday Inn")
	void CompanyOfRecord984() {
		assertEquals("Holiday Inn", customers.get(983).getCompany());
	}

	@Test
	@DisplayName("Record 984: Address is 94112 Anania Dr")
	void AddressOfRecord984() {
		assertEquals("94112 Anania Dr", customers.get(983).getAddress());
	}

	@Test
	@DisplayName("Record 984: City is Mililani")
	void CityOfRecord984() {
		assertEquals("Mililani", customers.get(983).getCity());
	}

	@Test
	@DisplayName("Record 984: County is Honolulu")
	void CountyOfRecord984() {
		assertEquals("Honolulu", customers.get(983).getCounty());
	}

	@Test
	@DisplayName("Record 984: State is HI")
	void StateOfRecord984() {
		assertEquals("HI", customers.get(983).getState());
	}

	@Test
	@DisplayName("Record 984: ZIP is 96789")
	void ZIPOfRecord984() {
		assertEquals("96789", customers.get(983).getZIP());
	}

	@Test
	@DisplayName("Record 984: Phone is 808-623-2293")
	void PhoneOfRecord984() {
		assertEquals("808-623-2293", customers.get(983).getPhone());
	}

	@Test
	@DisplayName("Record 984: Fax is 808-623-7743")
	void FaxOfRecord984() {
		assertEquals("808-623-7743", customers.get(983).getFax());
	}

	@Test
	@DisplayName("Record 984: Email is jacques@aagaard.com")
	void EmailOfRecord984() {
		assertEquals("jacques@aagaard.com", customers.get(983).getEmail());
	}

	@Test
	@DisplayName("Record 984: Web is http://www.jacquesaagaard.com")
	void WebOfRecord984() {
		assertEquals("http://www.jacquesaagaard.com", customers.get(983).getWeb());
	}
}
