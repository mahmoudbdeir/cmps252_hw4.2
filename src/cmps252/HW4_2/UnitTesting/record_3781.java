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

@Tag("3")
class Record_3781 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3781: FirstName is Josef")
	void FirstNameOfRecord3781() {
		assertEquals("Josef", customers.get(3780).getFirstName());
	}

	@Test
	@DisplayName("Record 3781: LastName is Vazzana")
	void LastNameOfRecord3781() {
		assertEquals("Vazzana", customers.get(3780).getLastName());
	}

	@Test
	@DisplayName("Record 3781: Company is Rebppak Inc")
	void CompanyOfRecord3781() {
		assertEquals("Rebppak Inc", customers.get(3780).getCompany());
	}

	@Test
	@DisplayName("Record 3781: Address is 12117 Nebel St")
	void AddressOfRecord3781() {
		assertEquals("12117 Nebel St", customers.get(3780).getAddress());
	}

	@Test
	@DisplayName("Record 3781: City is Rockville")
	void CityOfRecord3781() {
		assertEquals("Rockville", customers.get(3780).getCity());
	}

	@Test
	@DisplayName("Record 3781: County is Montgomery")
	void CountyOfRecord3781() {
		assertEquals("Montgomery", customers.get(3780).getCounty());
	}

	@Test
	@DisplayName("Record 3781: State is MD")
	void StateOfRecord3781() {
		assertEquals("MD", customers.get(3780).getState());
	}

	@Test
	@DisplayName("Record 3781: ZIP is 20852")
	void ZIPOfRecord3781() {
		assertEquals("20852", customers.get(3780).getZIP());
	}

	@Test
	@DisplayName("Record 3781: Phone is 301-468-4833")
	void PhoneOfRecord3781() {
		assertEquals("301-468-4833", customers.get(3780).getPhone());
	}

	@Test
	@DisplayName("Record 3781: Fax is 301-468-8768")
	void FaxOfRecord3781() {
		assertEquals("301-468-8768", customers.get(3780).getFax());
	}

	@Test
	@DisplayName("Record 3781: Email is josef@vazzana.com")
	void EmailOfRecord3781() {
		assertEquals("josef@vazzana.com", customers.get(3780).getEmail());
	}

	@Test
	@DisplayName("Record 3781: Web is http://www.josefvazzana.com")
	void WebOfRecord3781() {
		assertEquals("http://www.josefvazzana.com", customers.get(3780).getWeb());
	}
}
