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

@Tag("23")
class Record_1373 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1373: FirstName is Darin")
	void FirstNameOfRecord1373() {
		assertEquals("Darin", customers.get(1372).getFirstName());
	}

	@Test
	@DisplayName("Record 1373: LastName is Montalbano")
	void LastNameOfRecord1373() {
		assertEquals("Montalbano", customers.get(1372).getLastName());
	}

	@Test
	@DisplayName("Record 1373: Company is Jones, Randal R Esq")
	void CompanyOfRecord1373() {
		assertEquals("Jones, Randal R Esq", customers.get(1372).getCompany());
	}

	@Test
	@DisplayName("Record 1373: Address is 63 N Main St")
	void AddressOfRecord1373() {
		assertEquals("63 N Main St", customers.get(1372).getAddress());
	}

	@Test
	@DisplayName("Record 1373: City is London")
	void CityOfRecord1373() {
		assertEquals("London", customers.get(1372).getCity());
	}

	@Test
	@DisplayName("Record 1373: County is Madison")
	void CountyOfRecord1373() {
		assertEquals("Madison", customers.get(1372).getCounty());
	}

	@Test
	@DisplayName("Record 1373: State is OH")
	void StateOfRecord1373() {
		assertEquals("OH", customers.get(1372).getState());
	}

	@Test
	@DisplayName("Record 1373: ZIP is 43140")
	void ZIPOfRecord1373() {
		assertEquals("43140", customers.get(1372).getZIP());
	}

	@Test
	@DisplayName("Record 1373: Phone is 740-852-9554")
	void PhoneOfRecord1373() {
		assertEquals("740-852-9554", customers.get(1372).getPhone());
	}

	@Test
	@DisplayName("Record 1373: Fax is 740-852-1217")
	void FaxOfRecord1373() {
		assertEquals("740-852-1217", customers.get(1372).getFax());
	}

	@Test
	@DisplayName("Record 1373: Email is darin@montalbano.com")
	void EmailOfRecord1373() {
		assertEquals("darin@montalbano.com", customers.get(1372).getEmail());
	}

	@Test
	@DisplayName("Record 1373: Web is http://www.darinmontalbano.com")
	void WebOfRecord1373() {
		assertEquals("http://www.darinmontalbano.com", customers.get(1372).getWeb());
	}
}
