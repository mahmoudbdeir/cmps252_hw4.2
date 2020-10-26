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

@Tag("37")
class Record_4203 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4203: FirstName is Rosalie")
	void FirstNameOfRecord4203() {
		assertEquals("Rosalie", customers.get(4202).getFirstName());
	}

	@Test
	@DisplayName("Record 4203: LastName is Furber")
	void LastNameOfRecord4203() {
		assertEquals("Furber", customers.get(4202).getLastName());
	}

	@Test
	@DisplayName("Record 4203: Company is Smith, James E")
	void CompanyOfRecord4203() {
		assertEquals("Smith, James E", customers.get(4202).getCompany());
	}

	@Test
	@DisplayName("Record 4203: Address is 603 S Washington Ave")
	void AddressOfRecord4203() {
		assertEquals("603 S Washington Ave", customers.get(4202).getAddress());
	}

	@Test
	@DisplayName("Record 4203: City is Lansing")
	void CityOfRecord4203() {
		assertEquals("Lansing", customers.get(4202).getCity());
	}

	@Test
	@DisplayName("Record 4203: County is Ingham")
	void CountyOfRecord4203() {
		assertEquals("Ingham", customers.get(4202).getCounty());
	}

	@Test
	@DisplayName("Record 4203: State is MI")
	void StateOfRecord4203() {
		assertEquals("MI", customers.get(4202).getState());
	}

	@Test
	@DisplayName("Record 4203: ZIP is 48933")
	void ZIPOfRecord4203() {
		assertEquals("48933", customers.get(4202).getZIP());
	}

	@Test
	@DisplayName("Record 4203: Phone is 517-372-3222")
	void PhoneOfRecord4203() {
		assertEquals("517-372-3222", customers.get(4202).getPhone());
	}

	@Test
	@DisplayName("Record 4203: Fax is 517-372-3258")
	void FaxOfRecord4203() {
		assertEquals("517-372-3258", customers.get(4202).getFax());
	}

	@Test
	@DisplayName("Record 4203: Email is rosalie@furber.com")
	void EmailOfRecord4203() {
		assertEquals("rosalie@furber.com", customers.get(4202).getEmail());
	}

	@Test
	@DisplayName("Record 4203: Web is http://www.rosaliefurber.com")
	void WebOfRecord4203() {
		assertEquals("http://www.rosaliefurber.com", customers.get(4202).getWeb());
	}
}
