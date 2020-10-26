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

@Tag("27")
class Record_523 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 523: FirstName is Geri")
	void FirstNameOfRecord523() {
		assertEquals("Geri", customers.get(522).getFirstName());
	}

	@Test
	@DisplayName("Record 523: LastName is Tabora")
	void LastNameOfRecord523() {
		assertEquals("Tabora", customers.get(522).getLastName());
	}

	@Test
	@DisplayName("Record 523: Company is Shippers Supply & Pallet Co")
	void CompanyOfRecord523() {
		assertEquals("Shippers Supply & Pallet Co", customers.get(522).getCompany());
	}

	@Test
	@DisplayName("Record 523: Address is 1691 Los Angeles Ave")
	void AddressOfRecord523() {
		assertEquals("1691 Los Angeles Ave", customers.get(522).getAddress());
	}

	@Test
	@DisplayName("Record 523: City is Ventura")
	void CityOfRecord523() {
		assertEquals("Ventura", customers.get(522).getCity());
	}

	@Test
	@DisplayName("Record 523: County is Ventura")
	void CountyOfRecord523() {
		assertEquals("Ventura", customers.get(522).getCounty());
	}

	@Test
	@DisplayName("Record 523: State is CA")
	void StateOfRecord523() {
		assertEquals("CA", customers.get(522).getState());
	}

	@Test
	@DisplayName("Record 523: ZIP is 93004")
	void ZIPOfRecord523() {
		assertEquals("93004", customers.get(522).getZIP());
	}

	@Test
	@DisplayName("Record 523: Phone is 805-659-5767")
	void PhoneOfRecord523() {
		assertEquals("805-659-5767", customers.get(522).getPhone());
	}

	@Test
	@DisplayName("Record 523: Fax is 805-659-1632")
	void FaxOfRecord523() {
		assertEquals("805-659-1632", customers.get(522).getFax());
	}

	@Test
	@DisplayName("Record 523: Email is geri@tabora.com")
	void EmailOfRecord523() {
		assertEquals("geri@tabora.com", customers.get(522).getEmail());
	}

	@Test
	@DisplayName("Record 523: Web is http://www.geritabora.com")
	void WebOfRecord523() {
		assertEquals("http://www.geritabora.com", customers.get(522).getWeb());
	}
}
