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

@Tag("30")
class Record_3695 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3695: FirstName is Angela")
	void FirstNameOfRecord3695() {
		assertEquals("Angela", customers.get(3694).getFirstName());
	}

	@Test
	@DisplayName("Record 3695: LastName is Quintard")
	void LastNameOfRecord3695() {
		assertEquals("Quintard", customers.get(3694).getLastName());
	}

	@Test
	@DisplayName("Record 3695: Company is Subworks")
	void CompanyOfRecord3695() {
		assertEquals("Subworks", customers.get(3694).getCompany());
	}

	@Test
	@DisplayName("Record 3695: Address is 145 Cedar St")
	void AddressOfRecord3695() {
		assertEquals("145 Cedar St", customers.get(3694).getAddress());
	}

	@Test
	@DisplayName("Record 3695: City is Somerville")
	void CityOfRecord3695() {
		assertEquals("Somerville", customers.get(3694).getCity());
	}

	@Test
	@DisplayName("Record 3695: County is Middlesex")
	void CountyOfRecord3695() {
		assertEquals("Middlesex", customers.get(3694).getCounty());
	}

	@Test
	@DisplayName("Record 3695: State is MA")
	void StateOfRecord3695() {
		assertEquals("MA", customers.get(3694).getState());
	}

	@Test
	@DisplayName("Record 3695: ZIP is 2144")
	void ZIPOfRecord3695() {
		assertEquals("2144", customers.get(3694).getZIP());
	}

	@Test
	@DisplayName("Record 3695: Phone is 617-628-3099")
	void PhoneOfRecord3695() {
		assertEquals("617-628-3099", customers.get(3694).getPhone());
	}

	@Test
	@DisplayName("Record 3695: Fax is 617-628-8982")
	void FaxOfRecord3695() {
		assertEquals("617-628-8982", customers.get(3694).getFax());
	}

	@Test
	@DisplayName("Record 3695: Email is angela@quintard.com")
	void EmailOfRecord3695() {
		assertEquals("angela@quintard.com", customers.get(3694).getEmail());
	}

	@Test
	@DisplayName("Record 3695: Web is http://www.angelaquintard.com")
	void WebOfRecord3695() {
		assertEquals("http://www.angelaquintard.com", customers.get(3694).getWeb());
	}
}
