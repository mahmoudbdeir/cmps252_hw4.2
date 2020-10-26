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

@Tag("4")
class Record_1313 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1313: FirstName is Ferdinand")
	void FirstNameOfRecord1313() {
		assertEquals("Ferdinand", customers.get(1312).getFirstName());
	}

	@Test
	@DisplayName("Record 1313: LastName is Wensman")
	void LastNameOfRecord1313() {
		assertEquals("Wensman", customers.get(1312).getLastName());
	}

	@Test
	@DisplayName("Record 1313: Company is Ancel, Steven H Esq")
	void CompanyOfRecord1313() {
		assertEquals("Ancel, Steven H Esq", customers.get(1312).getCompany());
	}

	@Test
	@DisplayName("Record 1313: Address is 2015 Washington St")
	void AddressOfRecord1313() {
		assertEquals("2015 Washington St", customers.get(1312).getAddress());
	}

	@Test
	@DisplayName("Record 1313: City is Kansas City")
	void CityOfRecord1313() {
		assertEquals("Kansas City", customers.get(1312).getCity());
	}

	@Test
	@DisplayName("Record 1313: County is Jackson")
	void CountyOfRecord1313() {
		assertEquals("Jackson", customers.get(1312).getCounty());
	}

	@Test
	@DisplayName("Record 1313: State is MO")
	void StateOfRecord1313() {
		assertEquals("MO", customers.get(1312).getState());
	}

	@Test
	@DisplayName("Record 1313: ZIP is 64108")
	void ZIPOfRecord1313() {
		assertEquals("64108", customers.get(1312).getZIP());
	}

	@Test
	@DisplayName("Record 1313: Phone is 816-471-7287")
	void PhoneOfRecord1313() {
		assertEquals("816-471-7287", customers.get(1312).getPhone());
	}

	@Test
	@DisplayName("Record 1313: Fax is 816-471-9791")
	void FaxOfRecord1313() {
		assertEquals("816-471-9791", customers.get(1312).getFax());
	}

	@Test
	@DisplayName("Record 1313: Email is ferdinand@wensman.com")
	void EmailOfRecord1313() {
		assertEquals("ferdinand@wensman.com", customers.get(1312).getEmail());
	}

	@Test
	@DisplayName("Record 1313: Web is http://www.ferdinandwensman.com")
	void WebOfRecord1313() {
		assertEquals("http://www.ferdinandwensman.com", customers.get(1312).getWeb());
	}
}
