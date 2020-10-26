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

@Tag("41")
class Record_1781 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1781: FirstName is Edmond")
	void FirstNameOfRecord1781() {
		assertEquals("Edmond", customers.get(1780).getFirstName());
	}

	@Test
	@DisplayName("Record 1781: LastName is Nanke")
	void LastNameOfRecord1781() {
		assertEquals("Nanke", customers.get(1780).getLastName());
	}

	@Test
	@DisplayName("Record 1781: Company is Noel, Philip W Esq")
	void CompanyOfRecord1781() {
		assertEquals("Noel, Philip W Esq", customers.get(1780).getCompany());
	}

	@Test
	@DisplayName("Record 1781: Address is 405 N Paca St")
	void AddressOfRecord1781() {
		assertEquals("405 N Paca St", customers.get(1780).getAddress());
	}

	@Test
	@DisplayName("Record 1781: City is Baltimore")
	void CityOfRecord1781() {
		assertEquals("Baltimore", customers.get(1780).getCity());
	}

	@Test
	@DisplayName("Record 1781: County is Baltimore City")
	void CountyOfRecord1781() {
		assertEquals("Baltimore City", customers.get(1780).getCounty());
	}

	@Test
	@DisplayName("Record 1781: State is MD")
	void StateOfRecord1781() {
		assertEquals("MD", customers.get(1780).getState());
	}

	@Test
	@DisplayName("Record 1781: ZIP is 21201")
	void ZIPOfRecord1781() {
		assertEquals("21201", customers.get(1780).getZIP());
	}

	@Test
	@DisplayName("Record 1781: Phone is 410-539-4186")
	void PhoneOfRecord1781() {
		assertEquals("410-539-4186", customers.get(1780).getPhone());
	}

	@Test
	@DisplayName("Record 1781: Fax is 410-539-9887")
	void FaxOfRecord1781() {
		assertEquals("410-539-9887", customers.get(1780).getFax());
	}

	@Test
	@DisplayName("Record 1781: Email is edmond@nanke.com")
	void EmailOfRecord1781() {
		assertEquals("edmond@nanke.com", customers.get(1780).getEmail());
	}

	@Test
	@DisplayName("Record 1781: Web is http://www.edmondnanke.com")
	void WebOfRecord1781() {
		assertEquals("http://www.edmondnanke.com", customers.get(1780).getWeb());
	}
}
