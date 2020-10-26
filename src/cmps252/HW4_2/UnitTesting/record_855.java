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
class Record_855 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 855: FirstName is Andres")
	void FirstNameOfRecord855() {
		assertEquals("Andres", customers.get(854).getFirstName());
	}

	@Test
	@DisplayName("Record 855: LastName is Hickie")
	void LastNameOfRecord855() {
		assertEquals("Hickie", customers.get(854).getLastName());
	}

	@Test
	@DisplayName("Record 855: Company is Construction Products Inc")
	void CompanyOfRecord855() {
		assertEquals("Construction Products Inc", customers.get(854).getCompany());
	}

	@Test
	@DisplayName("Record 855: Address is 2757 Gilchrist Rd")
	void AddressOfRecord855() {
		assertEquals("2757 Gilchrist Rd", customers.get(854).getAddress());
	}

	@Test
	@DisplayName("Record 855: City is Akron")
	void CityOfRecord855() {
		assertEquals("Akron", customers.get(854).getCity());
	}

	@Test
	@DisplayName("Record 855: County is Summit")
	void CountyOfRecord855() {
		assertEquals("Summit", customers.get(854).getCounty());
	}

	@Test
	@DisplayName("Record 855: State is OH")
	void StateOfRecord855() {
		assertEquals("OH", customers.get(854).getState());
	}

	@Test
	@DisplayName("Record 855: ZIP is 44305")
	void ZIPOfRecord855() {
		assertEquals("44305", customers.get(854).getZIP());
	}

	@Test
	@DisplayName("Record 855: Phone is 330-794-0518")
	void PhoneOfRecord855() {
		assertEquals("330-794-0518", customers.get(854).getPhone());
	}

	@Test
	@DisplayName("Record 855: Fax is 330-794-7415")
	void FaxOfRecord855() {
		assertEquals("330-794-7415", customers.get(854).getFax());
	}

	@Test
	@DisplayName("Record 855: Email is andres@hickie.com")
	void EmailOfRecord855() {
		assertEquals("andres@hickie.com", customers.get(854).getEmail());
	}

	@Test
	@DisplayName("Record 855: Web is http://www.andreshickie.com")
	void WebOfRecord855() {
		assertEquals("http://www.andreshickie.com", customers.get(854).getWeb());
	}
}
