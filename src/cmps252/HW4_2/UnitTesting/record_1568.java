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

@Tag("17")
class Record_1568 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1568: FirstName is Tony")
	void FirstNameOfRecord1568() {
		assertEquals("Tony", customers.get(1567).getFirstName());
	}

	@Test
	@DisplayName("Record 1568: LastName is Burgette")
	void LastNameOfRecord1568() {
		assertEquals("Burgette", customers.get(1567).getLastName());
	}

	@Test
	@DisplayName("Record 1568: Company is Schlaff, John A Esq")
	void CompanyOfRecord1568() {
		assertEquals("Schlaff, John A Esq", customers.get(1567).getCompany());
	}

	@Test
	@DisplayName("Record 1568: Address is 416 Richmond Ave")
	void AddressOfRecord1568() {
		assertEquals("416 Richmond Ave", customers.get(1567).getAddress());
	}

	@Test
	@DisplayName("Record 1568: City is Point Pleasant Beach")
	void CityOfRecord1568() {
		assertEquals("Point Pleasant Beach", customers.get(1567).getCity());
	}

	@Test
	@DisplayName("Record 1568: County is Ocean")
	void CountyOfRecord1568() {
		assertEquals("Ocean", customers.get(1567).getCounty());
	}

	@Test
	@DisplayName("Record 1568: State is NJ")
	void StateOfRecord1568() {
		assertEquals("NJ", customers.get(1567).getState());
	}

	@Test
	@DisplayName("Record 1568: ZIP is 8742")
	void ZIPOfRecord1568() {
		assertEquals("8742", customers.get(1567).getZIP());
	}

	@Test
	@DisplayName("Record 1568: Phone is 732-899-6378")
	void PhoneOfRecord1568() {
		assertEquals("732-899-6378", customers.get(1567).getPhone());
	}

	@Test
	@DisplayName("Record 1568: Fax is 732-899-4531")
	void FaxOfRecord1568() {
		assertEquals("732-899-4531", customers.get(1567).getFax());
	}

	@Test
	@DisplayName("Record 1568: Email is tony@burgette.com")
	void EmailOfRecord1568() {
		assertEquals("tony@burgette.com", customers.get(1567).getEmail());
	}

	@Test
	@DisplayName("Record 1568: Web is http://www.tonyburgette.com")
	void WebOfRecord1568() {
		assertEquals("http://www.tonyburgette.com", customers.get(1567).getWeb());
	}
}
