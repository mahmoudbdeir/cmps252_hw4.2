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

@Tag("33")
class Record_3419 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3419: FirstName is Alan")
	void FirstNameOfRecord3419() {
		assertEquals("Alan", customers.get(3418).getFirstName());
	}

	@Test
	@DisplayName("Record 3419: LastName is Arbogast")
	void LastNameOfRecord3419() {
		assertEquals("Arbogast", customers.get(3418).getLastName());
	}

	@Test
	@DisplayName("Record 3419: Company is Lindelien, Keli Esq")
	void CompanyOfRecord3419() {
		assertEquals("Lindelien, Keli Esq", customers.get(3418).getCompany());
	}

	@Test
	@DisplayName("Record 3419: Address is 5370 52nd St Se")
	void AddressOfRecord3419() {
		assertEquals("5370 52nd St Se", customers.get(3418).getAddress());
	}

	@Test
	@DisplayName("Record 3419: City is Grand Rapids")
	void CityOfRecord3419() {
		assertEquals("Grand Rapids", customers.get(3418).getCity());
	}

	@Test
	@DisplayName("Record 3419: County is Kent")
	void CountyOfRecord3419() {
		assertEquals("Kent", customers.get(3418).getCounty());
	}

	@Test
	@DisplayName("Record 3419: State is MI")
	void StateOfRecord3419() {
		assertEquals("MI", customers.get(3418).getState());
	}

	@Test
	@DisplayName("Record 3419: ZIP is 49512")
	void ZIPOfRecord3419() {
		assertEquals("49512", customers.get(3418).getZIP());
	}

	@Test
	@DisplayName("Record 3419: Phone is 616-698-9093")
	void PhoneOfRecord3419() {
		assertEquals("616-698-9093", customers.get(3418).getPhone());
	}

	@Test
	@DisplayName("Record 3419: Fax is 616-698-6885")
	void FaxOfRecord3419() {
		assertEquals("616-698-6885", customers.get(3418).getFax());
	}

	@Test
	@DisplayName("Record 3419: Email is alan@arbogast.com")
	void EmailOfRecord3419() {
		assertEquals("alan@arbogast.com", customers.get(3418).getEmail());
	}

	@Test
	@DisplayName("Record 3419: Web is http://www.alanarbogast.com")
	void WebOfRecord3419() {
		assertEquals("http://www.alanarbogast.com", customers.get(3418).getWeb());
	}
}
