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
class Record_3743 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3743: FirstName is Rolland")
	void FirstNameOfRecord3743() {
		assertEquals("Rolland", customers.get(3742).getFirstName());
	}

	@Test
	@DisplayName("Record 3743: LastName is Sulit")
	void LastNameOfRecord3743() {
		assertEquals("Sulit", customers.get(3742).getLastName());
	}

	@Test
	@DisplayName("Record 3743: Company is Signtech")
	void CompanyOfRecord3743() {
		assertEquals("Signtech", customers.get(3742).getCompany());
	}

	@Test
	@DisplayName("Record 3743: Address is 621 S Bon View Ave")
	void AddressOfRecord3743() {
		assertEquals("621 S Bon View Ave", customers.get(3742).getAddress());
	}

	@Test
	@DisplayName("Record 3743: City is Ontario")
	void CityOfRecord3743() {
		assertEquals("Ontario", customers.get(3742).getCity());
	}

	@Test
	@DisplayName("Record 3743: County is San Bernardino")
	void CountyOfRecord3743() {
		assertEquals("San Bernardino", customers.get(3742).getCounty());
	}

	@Test
	@DisplayName("Record 3743: State is CA")
	void StateOfRecord3743() {
		assertEquals("CA", customers.get(3742).getState());
	}

	@Test
	@DisplayName("Record 3743: ZIP is 91761")
	void ZIPOfRecord3743() {
		assertEquals("91761", customers.get(3742).getZIP());
	}

	@Test
	@DisplayName("Record 3743: Phone is 909-984-1846")
	void PhoneOfRecord3743() {
		assertEquals("909-984-1846", customers.get(3742).getPhone());
	}

	@Test
	@DisplayName("Record 3743: Fax is 909-984-5912")
	void FaxOfRecord3743() {
		assertEquals("909-984-5912", customers.get(3742).getFax());
	}

	@Test
	@DisplayName("Record 3743: Email is rolland@sulit.com")
	void EmailOfRecord3743() {
		assertEquals("rolland@sulit.com", customers.get(3742).getEmail());
	}

	@Test
	@DisplayName("Record 3743: Web is http://www.rollandsulit.com")
	void WebOfRecord3743() {
		assertEquals("http://www.rollandsulit.com", customers.get(3742).getWeb());
	}
}
