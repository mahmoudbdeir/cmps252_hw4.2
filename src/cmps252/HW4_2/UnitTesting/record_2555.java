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
class Record_2555 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2555: FirstName is Maritsa")
	void FirstNameOfRecord2555() {
		assertEquals("Maritsa", customers.get(2554).getFirstName());
	}

	@Test
	@DisplayName("Record 2555: LastName is Vanish")
	void LastNameOfRecord2555() {
		assertEquals("Vanish", customers.get(2554).getLastName());
	}

	@Test
	@DisplayName("Record 2555: Company is Johnson Power Systems")
	void CompanyOfRecord2555() {
		assertEquals("Johnson Power Systems", customers.get(2554).getCompany());
	}

	@Test
	@DisplayName("Record 2555: Address is 32355 Howard Ave")
	void AddressOfRecord2555() {
		assertEquals("32355 Howard Ave", customers.get(2554).getAddress());
	}

	@Test
	@DisplayName("Record 2555: City is Madison Hyghts")
	void CityOfRecord2555() {
		assertEquals("Madison Hyghts", customers.get(2554).getCity());
	}

	@Test
	@DisplayName("Record 2555: County is Oakland")
	void CountyOfRecord2555() {
		assertEquals("Oakland", customers.get(2554).getCounty());
	}

	@Test
	@DisplayName("Record 2555: State is MI")
	void StateOfRecord2555() {
		assertEquals("MI", customers.get(2554).getState());
	}

	@Test
	@DisplayName("Record 2555: ZIP is 48071")
	void ZIPOfRecord2555() {
		assertEquals("48071", customers.get(2554).getZIP());
	}

	@Test
	@DisplayName("Record 2555: Phone is 248-589-6694")
	void PhoneOfRecord2555() {
		assertEquals("248-589-6694", customers.get(2554).getPhone());
	}

	@Test
	@DisplayName("Record 2555: Fax is 248-589-9436")
	void FaxOfRecord2555() {
		assertEquals("248-589-9436", customers.get(2554).getFax());
	}

	@Test
	@DisplayName("Record 2555: Email is maritsa@vanish.com")
	void EmailOfRecord2555() {
		assertEquals("maritsa@vanish.com", customers.get(2554).getEmail());
	}

	@Test
	@DisplayName("Record 2555: Web is http://www.maritsavanish.com")
	void WebOfRecord2555() {
		assertEquals("http://www.maritsavanish.com", customers.get(2554).getWeb());
	}
}
