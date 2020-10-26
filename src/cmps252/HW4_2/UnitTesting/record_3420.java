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

@Tag("18")
class Record_3420 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3420: FirstName is Monique")
	void FirstNameOfRecord3420() {
		assertEquals("Monique", customers.get(3419).getFirstName());
	}

	@Test
	@DisplayName("Record 3420: LastName is Leve")
	void LastNameOfRecord3420() {
		assertEquals("Leve", customers.get(3419).getLastName());
	}

	@Test
	@DisplayName("Record 3420: Company is Fdl Foods Retail Market")
	void CompanyOfRecord3420() {
		assertEquals("Fdl Foods Retail Market", customers.get(3419).getCompany());
	}

	@Test
	@DisplayName("Record 3420: Address is 30 Southard Ave")
	void AddressOfRecord3420() {
		assertEquals("30 Southard Ave", customers.get(3419).getAddress());
	}

	@Test
	@DisplayName("Record 3420: City is Farmingdale")
	void CityOfRecord3420() {
		assertEquals("Farmingdale", customers.get(3419).getCity());
	}

	@Test
	@DisplayName("Record 3420: County is Monmouth")
	void CountyOfRecord3420() {
		assertEquals("Monmouth", customers.get(3419).getCounty());
	}

	@Test
	@DisplayName("Record 3420: State is NJ")
	void StateOfRecord3420() {
		assertEquals("NJ", customers.get(3419).getState());
	}

	@Test
	@DisplayName("Record 3420: ZIP is 7727")
	void ZIPOfRecord3420() {
		assertEquals("7727", customers.get(3419).getZIP());
	}

	@Test
	@DisplayName("Record 3420: Phone is 732-938-1705")
	void PhoneOfRecord3420() {
		assertEquals("732-938-1705", customers.get(3419).getPhone());
	}

	@Test
	@DisplayName("Record 3420: Fax is 732-938-1767")
	void FaxOfRecord3420() {
		assertEquals("732-938-1767", customers.get(3419).getFax());
	}

	@Test
	@DisplayName("Record 3420: Email is monique@leve.com")
	void EmailOfRecord3420() {
		assertEquals("monique@leve.com", customers.get(3419).getEmail());
	}

	@Test
	@DisplayName("Record 3420: Web is http://www.moniqueleve.com")
	void WebOfRecord3420() {
		assertEquals("http://www.moniqueleve.com", customers.get(3419).getWeb());
	}
}
