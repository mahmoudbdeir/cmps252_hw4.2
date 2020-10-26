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

@Tag("10")
class Record_1631 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1631: FirstName is Len")
	void FirstNameOfRecord1631() {
		assertEquals("Len", customers.get(1630).getFirstName());
	}

	@Test
	@DisplayName("Record 1631: LastName is Niebergall")
	void LastNameOfRecord1631() {
		assertEquals("Niebergall", customers.get(1630).getLastName());
	}

	@Test
	@DisplayName("Record 1631: Company is Cervenak, James E Esq")
	void CompanyOfRecord1631() {
		assertEquals("Cervenak, James E Esq", customers.get(1630).getCompany());
	}

	@Test
	@DisplayName("Record 1631: Address is 2011 N Southport Ave")
	void AddressOfRecord1631() {
		assertEquals("2011 N Southport Ave", customers.get(1630).getAddress());
	}

	@Test
	@DisplayName("Record 1631: City is Chicago")
	void CityOfRecord1631() {
		assertEquals("Chicago", customers.get(1630).getCity());
	}

	@Test
	@DisplayName("Record 1631: County is Cook")
	void CountyOfRecord1631() {
		assertEquals("Cook", customers.get(1630).getCounty());
	}

	@Test
	@DisplayName("Record 1631: State is IL")
	void StateOfRecord1631() {
		assertEquals("IL", customers.get(1630).getState());
	}

	@Test
	@DisplayName("Record 1631: ZIP is 60614")
	void ZIPOfRecord1631() {
		assertEquals("60614", customers.get(1630).getZIP());
	}

	@Test
	@DisplayName("Record 1631: Phone is 773-248-0733")
	void PhoneOfRecord1631() {
		assertEquals("773-248-0733", customers.get(1630).getPhone());
	}

	@Test
	@DisplayName("Record 1631: Fax is 773-248-4007")
	void FaxOfRecord1631() {
		assertEquals("773-248-4007", customers.get(1630).getFax());
	}

	@Test
	@DisplayName("Record 1631: Email is len@niebergall.com")
	void EmailOfRecord1631() {
		assertEquals("len@niebergall.com", customers.get(1630).getEmail());
	}

	@Test
	@DisplayName("Record 1631: Web is http://www.lenniebergall.com")
	void WebOfRecord1631() {
		assertEquals("http://www.lenniebergall.com", customers.get(1630).getWeb());
	}
}
