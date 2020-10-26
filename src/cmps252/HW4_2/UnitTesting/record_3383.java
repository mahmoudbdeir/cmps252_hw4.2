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

@Tag("29")
class Record_3383 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3383: FirstName is Teodoro")
	void FirstNameOfRecord3383() {
		assertEquals("Teodoro", customers.get(3382).getFirstName());
	}

	@Test
	@DisplayName("Record 3383: LastName is Talaska")
	void LastNameOfRecord3383() {
		assertEquals("Talaska", customers.get(3382).getLastName());
	}

	@Test
	@DisplayName("Record 3383: Company is Mining Information")
	void CompanyOfRecord3383() {
		assertEquals("Mining Information", customers.get(3382).getCompany());
	}

	@Test
	@DisplayName("Record 3383: Address is 806 Main St")
	void AddressOfRecord3383() {
		assertEquals("806 Main St", customers.get(3382).getAddress());
	}

	@Test
	@DisplayName("Record 3383: City is Poughkeepsie")
	void CityOfRecord3383() {
		assertEquals("Poughkeepsie", customers.get(3382).getCity());
	}

	@Test
	@DisplayName("Record 3383: County is Dutchess")
	void CountyOfRecord3383() {
		assertEquals("Dutchess", customers.get(3382).getCounty());
	}

	@Test
	@DisplayName("Record 3383: State is NY")
	void StateOfRecord3383() {
		assertEquals("NY", customers.get(3382).getState());
	}

	@Test
	@DisplayName("Record 3383: ZIP is 12603")
	void ZIPOfRecord3383() {
		assertEquals("12603", customers.get(3382).getZIP());
	}

	@Test
	@DisplayName("Record 3383: Phone is 845-473-2656")
	void PhoneOfRecord3383() {
		assertEquals("845-473-2656", customers.get(3382).getPhone());
	}

	@Test
	@DisplayName("Record 3383: Fax is 845-473-7506")
	void FaxOfRecord3383() {
		assertEquals("845-473-7506", customers.get(3382).getFax());
	}

	@Test
	@DisplayName("Record 3383: Email is teodoro@talaska.com")
	void EmailOfRecord3383() {
		assertEquals("teodoro@talaska.com", customers.get(3382).getEmail());
	}

	@Test
	@DisplayName("Record 3383: Web is http://www.teodorotalaska.com")
	void WebOfRecord3383() {
		assertEquals("http://www.teodorotalaska.com", customers.get(3382).getWeb());
	}
}
