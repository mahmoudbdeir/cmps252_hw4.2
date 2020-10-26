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
class Record_1907 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1907: FirstName is Geoffrey")
	void FirstNameOfRecord1907() {
		assertEquals("Geoffrey", customers.get(1906).getFirstName());
	}

	@Test
	@DisplayName("Record 1907: LastName is Quelette")
	void LastNameOfRecord1907() {
		assertEquals("Quelette", customers.get(1906).getLastName());
	}

	@Test
	@DisplayName("Record 1907: Company is Control Associates Inc")
	void CompanyOfRecord1907() {
		assertEquals("Control Associates Inc", customers.get(1906).getCompany());
	}

	@Test
	@DisplayName("Record 1907: Address is 255 E 2nd St")
	void AddressOfRecord1907() {
		assertEquals("255 E 2nd St", customers.get(1906).getAddress());
	}

	@Test
	@DisplayName("Record 1907: City is Mineola")
	void CityOfRecord1907() {
		assertEquals("Mineola", customers.get(1906).getCity());
	}

	@Test
	@DisplayName("Record 1907: County is Nassau")
	void CountyOfRecord1907() {
		assertEquals("Nassau", customers.get(1906).getCounty());
	}

	@Test
	@DisplayName("Record 1907: State is NY")
	void StateOfRecord1907() {
		assertEquals("NY", customers.get(1906).getState());
	}

	@Test
	@DisplayName("Record 1907: ZIP is 11501")
	void ZIPOfRecord1907() {
		assertEquals("11501", customers.get(1906).getZIP());
	}

	@Test
	@DisplayName("Record 1907: Phone is 516-747-2926")
	void PhoneOfRecord1907() {
		assertEquals("516-747-2926", customers.get(1906).getPhone());
	}

	@Test
	@DisplayName("Record 1907: Fax is 516-747-6771")
	void FaxOfRecord1907() {
		assertEquals("516-747-6771", customers.get(1906).getFax());
	}

	@Test
	@DisplayName("Record 1907: Email is geoffrey@quelette.com")
	void EmailOfRecord1907() {
		assertEquals("geoffrey@quelette.com", customers.get(1906).getEmail());
	}

	@Test
	@DisplayName("Record 1907: Web is http://www.geoffreyquelette.com")
	void WebOfRecord1907() {
		assertEquals("http://www.geoffreyquelette.com", customers.get(1906).getWeb());
	}
}
