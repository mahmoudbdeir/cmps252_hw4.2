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

@Tag("32")
class Record_2611 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2611: FirstName is Sue")
	void FirstNameOfRecord2611() {
		assertEquals("Sue", customers.get(2610).getFirstName());
	}

	@Test
	@DisplayName("Record 2611: LastName is Brim")
	void LastNameOfRecord2611() {
		assertEquals("Brim", customers.get(2610).getLastName());
	}

	@Test
	@DisplayName("Record 2611: Company is Nepco Federal Credit Union")
	void CompanyOfRecord2611() {
		assertEquals("Nepco Federal Credit Union", customers.get(2610).getCompany());
	}

	@Test
	@DisplayName("Record 2611: Address is 2021 W Fulton St")
	void AddressOfRecord2611() {
		assertEquals("2021 W Fulton St", customers.get(2610).getAddress());
	}

	@Test
	@DisplayName("Record 2611: City is Chicago")
	void CityOfRecord2611() {
		assertEquals("Chicago", customers.get(2610).getCity());
	}

	@Test
	@DisplayName("Record 2611: County is Cook")
	void CountyOfRecord2611() {
		assertEquals("Cook", customers.get(2610).getCounty());
	}

	@Test
	@DisplayName("Record 2611: State is IL")
	void StateOfRecord2611() {
		assertEquals("IL", customers.get(2610).getState());
	}

	@Test
	@DisplayName("Record 2611: ZIP is 60612")
	void ZIPOfRecord2611() {
		assertEquals("60612", customers.get(2610).getZIP());
	}

	@Test
	@DisplayName("Record 2611: Phone is 312-733-9356")
	void PhoneOfRecord2611() {
		assertEquals("312-733-9356", customers.get(2610).getPhone());
	}

	@Test
	@DisplayName("Record 2611: Fax is 312-733-2031")
	void FaxOfRecord2611() {
		assertEquals("312-733-2031", customers.get(2610).getFax());
	}

	@Test
	@DisplayName("Record 2611: Email is sue@brim.com")
	void EmailOfRecord2611() {
		assertEquals("sue@brim.com", customers.get(2610).getEmail());
	}

	@Test
	@DisplayName("Record 2611: Web is http://www.suebrim.com")
	void WebOfRecord2611() {
		assertEquals("http://www.suebrim.com", customers.get(2610).getWeb());
	}
}
