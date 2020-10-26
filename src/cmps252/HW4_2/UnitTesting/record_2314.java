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
class Record_2314 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2314: FirstName is Carolyn")
	void FirstNameOfRecord2314() {
		assertEquals("Carolyn", customers.get(2313).getFirstName());
	}

	@Test
	@DisplayName("Record 2314: LastName is Buechler")
	void LastNameOfRecord2314() {
		assertEquals("Buechler", customers.get(2313).getLastName());
	}

	@Test
	@DisplayName("Record 2314: Company is Blue Chip Federal Credit Union")
	void CompanyOfRecord2314() {
		assertEquals("Blue Chip Federal Credit Union", customers.get(2313).getCompany());
	}

	@Test
	@DisplayName("Record 2314: Address is 8125 E 30th St  #-30b")
	void AddressOfRecord2314() {
		assertEquals("8125 E 30th St  #-30b", customers.get(2313).getAddress());
	}

	@Test
	@DisplayName("Record 2314: City is Indianapolis")
	void CityOfRecord2314() {
		assertEquals("Indianapolis", customers.get(2313).getCity());
	}

	@Test
	@DisplayName("Record 2314: County is Marion")
	void CountyOfRecord2314() {
		assertEquals("Marion", customers.get(2313).getCounty());
	}

	@Test
	@DisplayName("Record 2314: State is IN")
	void StateOfRecord2314() {
		assertEquals("IN", customers.get(2313).getState());
	}

	@Test
	@DisplayName("Record 2314: ZIP is 46219")
	void ZIPOfRecord2314() {
		assertEquals("46219", customers.get(2313).getZIP());
	}

	@Test
	@DisplayName("Record 2314: Phone is 317-898-6240")
	void PhoneOfRecord2314() {
		assertEquals("317-898-6240", customers.get(2313).getPhone());
	}

	@Test
	@DisplayName("Record 2314: Fax is 317-898-2602")
	void FaxOfRecord2314() {
		assertEquals("317-898-2602", customers.get(2313).getFax());
	}

	@Test
	@DisplayName("Record 2314: Email is carolyn@buechler.com")
	void EmailOfRecord2314() {
		assertEquals("carolyn@buechler.com", customers.get(2313).getEmail());
	}

	@Test
	@DisplayName("Record 2314: Web is http://www.carolynbuechler.com")
	void WebOfRecord2314() {
		assertEquals("http://www.carolynbuechler.com", customers.get(2313).getWeb());
	}
}
