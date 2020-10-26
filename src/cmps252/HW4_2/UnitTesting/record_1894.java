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

@Tag("31")
class Record_1894 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1894: FirstName is Sheri")
	void FirstNameOfRecord1894() {
		assertEquals("Sheri", customers.get(1893).getFirstName());
	}

	@Test
	@DisplayName("Record 1894: LastName is Nozum")
	void LastNameOfRecord1894() {
		assertEquals("Nozum", customers.get(1893).getLastName());
	}

	@Test
	@DisplayName("Record 1894: Company is Hymann, Richard M Esq")
	void CompanyOfRecord1894() {
		assertEquals("Hymann, Richard M Esq", customers.get(1893).getCompany());
	}

	@Test
	@DisplayName("Record 1894: Address is 1100 Wicomico St")
	void AddressOfRecord1894() {
		assertEquals("1100 Wicomico St", customers.get(1893).getAddress());
	}

	@Test
	@DisplayName("Record 1894: City is Baltimore")
	void CityOfRecord1894() {
		assertEquals("Baltimore", customers.get(1893).getCity());
	}

	@Test
	@DisplayName("Record 1894: County is Baltimore City")
	void CountyOfRecord1894() {
		assertEquals("Baltimore City", customers.get(1893).getCounty());
	}

	@Test
	@DisplayName("Record 1894: State is MD")
	void StateOfRecord1894() {
		assertEquals("MD", customers.get(1893).getState());
	}

	@Test
	@DisplayName("Record 1894: ZIP is 21230")
	void ZIPOfRecord1894() {
		assertEquals("21230", customers.get(1893).getZIP());
	}

	@Test
	@DisplayName("Record 1894: Phone is 410-727-9449")
	void PhoneOfRecord1894() {
		assertEquals("410-727-9449", customers.get(1893).getPhone());
	}

	@Test
	@DisplayName("Record 1894: Fax is 410-727-2549")
	void FaxOfRecord1894() {
		assertEquals("410-727-2549", customers.get(1893).getFax());
	}

	@Test
	@DisplayName("Record 1894: Email is sheri@nozum.com")
	void EmailOfRecord1894() {
		assertEquals("sheri@nozum.com", customers.get(1893).getEmail());
	}

	@Test
	@DisplayName("Record 1894: Web is http://www.sherinozum.com")
	void WebOfRecord1894() {
		assertEquals("http://www.sherinozum.com", customers.get(1893).getWeb());
	}
}
