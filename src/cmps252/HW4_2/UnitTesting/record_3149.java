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

@Tag("34")
class Record_3149 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3149: FirstName is Efren")
	void FirstNameOfRecord3149() {
		assertEquals("Efren", customers.get(3148).getFirstName());
	}

	@Test
	@DisplayName("Record 3149: LastName is Larison")
	void LastNameOfRecord3149() {
		assertEquals("Larison", customers.get(3148).getLastName());
	}

	@Test
	@DisplayName("Record 3149: Company is Inter County Subpoena Service")
	void CompanyOfRecord3149() {
		assertEquals("Inter County Subpoena Service", customers.get(3148).getCompany());
	}

	@Test
	@DisplayName("Record 3149: Address is Box #-531")
	void AddressOfRecord3149() {
		assertEquals("Box #-531", customers.get(3148).getAddress());
	}

	@Test
	@DisplayName("Record 3149: City is Susanville")
	void CityOfRecord3149() {
		assertEquals("Susanville", customers.get(3148).getCity());
	}

	@Test
	@DisplayName("Record 3149: County is Lassen")
	void CountyOfRecord3149() {
		assertEquals("Lassen", customers.get(3148).getCounty());
	}

	@Test
	@DisplayName("Record 3149: State is CA")
	void StateOfRecord3149() {
		assertEquals("CA", customers.get(3148).getState());
	}

	@Test
	@DisplayName("Record 3149: ZIP is 96130")
	void ZIPOfRecord3149() {
		assertEquals("96130", customers.get(3148).getZIP());
	}

	@Test
	@DisplayName("Record 3149: Phone is 530-257-6831")
	void PhoneOfRecord3149() {
		assertEquals("530-257-6831", customers.get(3148).getPhone());
	}

	@Test
	@DisplayName("Record 3149: Fax is 530-257-8114")
	void FaxOfRecord3149() {
		assertEquals("530-257-8114", customers.get(3148).getFax());
	}

	@Test
	@DisplayName("Record 3149: Email is efren@larison.com")
	void EmailOfRecord3149() {
		assertEquals("efren@larison.com", customers.get(3148).getEmail());
	}

	@Test
	@DisplayName("Record 3149: Web is http://www.efrenlarison.com")
	void WebOfRecord3149() {
		assertEquals("http://www.efrenlarison.com", customers.get(3148).getWeb());
	}
}
