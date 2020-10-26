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
class Record_1958 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1958: FirstName is Judith")
	void FirstNameOfRecord1958() {
		assertEquals("Judith", customers.get(1957).getFirstName());
	}

	@Test
	@DisplayName("Record 1958: LastName is Fitsgibbons")
	void LastNameOfRecord1958() {
		assertEquals("Fitsgibbons", customers.get(1957).getLastName());
	}

	@Test
	@DisplayName("Record 1958: Company is Sheepskin")
	void CompanyOfRecord1958() {
		assertEquals("Sheepskin", customers.get(1957).getCompany());
	}

	@Test
	@DisplayName("Record 1958: Address is 907 S Magnolia Ave")
	void AddressOfRecord1958() {
		assertEquals("907 S Magnolia Ave", customers.get(1957).getAddress());
	}

	@Test
	@DisplayName("Record 1958: City is Monrovia")
	void CityOfRecord1958() {
		assertEquals("Monrovia", customers.get(1957).getCity());
	}

	@Test
	@DisplayName("Record 1958: County is Los Angeles")
	void CountyOfRecord1958() {
		assertEquals("Los Angeles", customers.get(1957).getCounty());
	}

	@Test
	@DisplayName("Record 1958: State is CA")
	void StateOfRecord1958() {
		assertEquals("CA", customers.get(1957).getState());
	}

	@Test
	@DisplayName("Record 1958: ZIP is 91016")
	void ZIPOfRecord1958() {
		assertEquals("91016", customers.get(1957).getZIP());
	}

	@Test
	@DisplayName("Record 1958: Phone is 626-303-4382")
	void PhoneOfRecord1958() {
		assertEquals("626-303-4382", customers.get(1957).getPhone());
	}

	@Test
	@DisplayName("Record 1958: Fax is 626-303-4686")
	void FaxOfRecord1958() {
		assertEquals("626-303-4686", customers.get(1957).getFax());
	}

	@Test
	@DisplayName("Record 1958: Email is judith@fitsgibbons.com")
	void EmailOfRecord1958() {
		assertEquals("judith@fitsgibbons.com", customers.get(1957).getEmail());
	}

	@Test
	@DisplayName("Record 1958: Web is http://www.judithfitsgibbons.com")
	void WebOfRecord1958() {
		assertEquals("http://www.judithfitsgibbons.com", customers.get(1957).getWeb());
	}
}
