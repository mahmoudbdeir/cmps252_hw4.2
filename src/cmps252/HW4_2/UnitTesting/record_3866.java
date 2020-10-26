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

@Tag("16")
class Record_3866 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3866: FirstName is Jamey")
	void FirstNameOfRecord3866() {
		assertEquals("Jamey", customers.get(3865).getFirstName());
	}

	@Test
	@DisplayName("Record 3866: LastName is Gals")
	void LastNameOfRecord3866() {
		assertEquals("Gals", customers.get(3865).getLastName());
	}

	@Test
	@DisplayName("Record 3866: Company is Young Greg Travel")
	void CompanyOfRecord3866() {
		assertEquals("Young Greg Travel", customers.get(3865).getCompany());
	}

	@Test
	@DisplayName("Record 3866: Address is 426 S Main St")
	void AddressOfRecord3866() {
		assertEquals("426 S Main St", customers.get(3865).getAddress());
	}

	@Test
	@DisplayName("Record 3866: City is McAlester")
	void CityOfRecord3866() {
		assertEquals("McAlester", customers.get(3865).getCity());
	}

	@Test
	@DisplayName("Record 3866: County is Pittsburg")
	void CountyOfRecord3866() {
		assertEquals("Pittsburg", customers.get(3865).getCounty());
	}

	@Test
	@DisplayName("Record 3866: State is OK")
	void StateOfRecord3866() {
		assertEquals("OK", customers.get(3865).getState());
	}

	@Test
	@DisplayName("Record 3866: ZIP is 74501")
	void ZIPOfRecord3866() {
		assertEquals("74501", customers.get(3865).getZIP());
	}

	@Test
	@DisplayName("Record 3866: Phone is 918-423-7833")
	void PhoneOfRecord3866() {
		assertEquals("918-423-7833", customers.get(3865).getPhone());
	}

	@Test
	@DisplayName("Record 3866: Fax is 918-423-5387")
	void FaxOfRecord3866() {
		assertEquals("918-423-5387", customers.get(3865).getFax());
	}

	@Test
	@DisplayName("Record 3866: Email is jamey@gals.com")
	void EmailOfRecord3866() {
		assertEquals("jamey@gals.com", customers.get(3865).getEmail());
	}

	@Test
	@DisplayName("Record 3866: Web is http://www.jameygals.com")
	void WebOfRecord3866() {
		assertEquals("http://www.jameygals.com", customers.get(3865).getWeb());
	}
}
