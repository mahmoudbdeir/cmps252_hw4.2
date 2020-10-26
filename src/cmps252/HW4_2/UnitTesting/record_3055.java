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

@Tag("46")
class Record_3055 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3055: FirstName is Tabitha")
	void FirstNameOfRecord3055() {
		assertEquals("Tabitha", customers.get(3054).getFirstName());
	}

	@Test
	@DisplayName("Record 3055: LastName is Bushrod")
	void LastNameOfRecord3055() {
		assertEquals("Bushrod", customers.get(3054).getLastName());
	}

	@Test
	@DisplayName("Record 3055: Company is Ossman")
	void CompanyOfRecord3055() {
		assertEquals("Ossman", customers.get(3054).getCompany());
	}

	@Test
	@DisplayName("Record 3055: Address is 47 Maple Ave")
	void AddressOfRecord3055() {
		assertEquals("47 Maple Ave", customers.get(3054).getAddress());
	}

	@Test
	@DisplayName("Record 3055: City is Flemington")
	void CityOfRecord3055() {
		assertEquals("Flemington", customers.get(3054).getCity());
	}

	@Test
	@DisplayName("Record 3055: County is Hunterdon")
	void CountyOfRecord3055() {
		assertEquals("Hunterdon", customers.get(3054).getCounty());
	}

	@Test
	@DisplayName("Record 3055: State is NJ")
	void StateOfRecord3055() {
		assertEquals("NJ", customers.get(3054).getState());
	}

	@Test
	@DisplayName("Record 3055: ZIP is 8822")
	void ZIPOfRecord3055() {
		assertEquals("8822", customers.get(3054).getZIP());
	}

	@Test
	@DisplayName("Record 3055: Phone is 908-806-8277")
	void PhoneOfRecord3055() {
		assertEquals("908-806-8277", customers.get(3054).getPhone());
	}

	@Test
	@DisplayName("Record 3055: Fax is 908-806-1445")
	void FaxOfRecord3055() {
		assertEquals("908-806-1445", customers.get(3054).getFax());
	}

	@Test
	@DisplayName("Record 3055: Email is tabitha@bushrod.com")
	void EmailOfRecord3055() {
		assertEquals("tabitha@bushrod.com", customers.get(3054).getEmail());
	}

	@Test
	@DisplayName("Record 3055: Web is http://www.tabithabushrod.com")
	void WebOfRecord3055() {
		assertEquals("http://www.tabithabushrod.com", customers.get(3054).getWeb());
	}
}
