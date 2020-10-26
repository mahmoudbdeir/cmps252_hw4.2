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

@Tag("27")
class Record_3668 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3668: FirstName is Effie")
	void FirstNameOfRecord3668() {
		assertEquals("Effie", customers.get(3667).getFirstName());
	}

	@Test
	@DisplayName("Record 3668: LastName is Limbo")
	void LastNameOfRecord3668() {
		assertEquals("Limbo", customers.get(3667).getLastName());
	}

	@Test
	@DisplayName("Record 3668: Company is Business Pros Amer Inc")
	void CompanyOfRecord3668() {
		assertEquals("Business Pros Amer Inc", customers.get(3667).getCompany());
	}

	@Test
	@DisplayName("Record 3668: Address is 1320 S Washington St")
	void AddressOfRecord3668() {
		assertEquals("1320 S Washington St", customers.get(3667).getAddress());
	}

	@Test
	@DisplayName("Record 3668: City is North Attleboro")
	void CityOfRecord3668() {
		assertEquals("North Attleboro", customers.get(3667).getCity());
	}

	@Test
	@DisplayName("Record 3668: County is Bristol")
	void CountyOfRecord3668() {
		assertEquals("Bristol", customers.get(3667).getCounty());
	}

	@Test
	@DisplayName("Record 3668: State is MA")
	void StateOfRecord3668() {
		assertEquals("MA", customers.get(3667).getState());
	}

	@Test
	@DisplayName("Record 3668: ZIP is 2760")
	void ZIPOfRecord3668() {
		assertEquals("2760", customers.get(3667).getZIP());
	}

	@Test
	@DisplayName("Record 3668: Phone is 508-643-1254")
	void PhoneOfRecord3668() {
		assertEquals("508-643-1254", customers.get(3667).getPhone());
	}

	@Test
	@DisplayName("Record 3668: Fax is 508-643-0807")
	void FaxOfRecord3668() {
		assertEquals("508-643-0807", customers.get(3667).getFax());
	}

	@Test
	@DisplayName("Record 3668: Email is effie@limbo.com")
	void EmailOfRecord3668() {
		assertEquals("effie@limbo.com", customers.get(3667).getEmail());
	}

	@Test
	@DisplayName("Record 3668: Web is http://www.effielimbo.com")
	void WebOfRecord3668() {
		assertEquals("http://www.effielimbo.com", customers.get(3667).getWeb());
	}
}
