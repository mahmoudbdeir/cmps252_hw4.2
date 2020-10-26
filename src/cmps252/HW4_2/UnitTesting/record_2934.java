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

@Tag("26")
class Record_2934 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2934: FirstName is Lee")
	void FirstNameOfRecord2934() {
		assertEquals("Lee", customers.get(2933).getFirstName());
	}

	@Test
	@DisplayName("Record 2934: LastName is Musa")
	void LastNameOfRecord2934() {
		assertEquals("Musa", customers.get(2933).getLastName());
	}

	@Test
	@DisplayName("Record 2934: Company is Pt Fed Svngs Bnk Mrtg Divsn")
	void CompanyOfRecord2934() {
		assertEquals("Pt Fed Svngs Bnk Mrtg Divsn", customers.get(2933).getCompany());
	}

	@Test
	@DisplayName("Record 2934: Address is 329 Canal Pl")
	void AddressOfRecord2934() {
		assertEquals("329 Canal Pl", customers.get(2933).getAddress());
	}

	@Test
	@DisplayName("Record 2934: City is Bronx")
	void CityOfRecord2934() {
		assertEquals("Bronx", customers.get(2933).getCity());
	}

	@Test
	@DisplayName("Record 2934: County is Bronx")
	void CountyOfRecord2934() {
		assertEquals("Bronx", customers.get(2933).getCounty());
	}

	@Test
	@DisplayName("Record 2934: State is NY")
	void StateOfRecord2934() {
		assertEquals("NY", customers.get(2933).getState());
	}

	@Test
	@DisplayName("Record 2934: ZIP is 10451")
	void ZIPOfRecord2934() {
		assertEquals("10451", customers.get(2933).getZIP());
	}

	@Test
	@DisplayName("Record 2934: Phone is 718-292-0735")
	void PhoneOfRecord2934() {
		assertEquals("718-292-0735", customers.get(2933).getPhone());
	}

	@Test
	@DisplayName("Record 2934: Fax is 718-292-2438")
	void FaxOfRecord2934() {
		assertEquals("718-292-2438", customers.get(2933).getFax());
	}

	@Test
	@DisplayName("Record 2934: Email is lee@musa.com")
	void EmailOfRecord2934() {
		assertEquals("lee@musa.com", customers.get(2933).getEmail());
	}

	@Test
	@DisplayName("Record 2934: Web is http://www.leemusa.com")
	void WebOfRecord2934() {
		assertEquals("http://www.leemusa.com", customers.get(2933).getWeb());
	}
}
