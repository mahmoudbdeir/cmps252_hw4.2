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

@Tag("44")
class Record_1495 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1495: FirstName is Lisa")
	void FirstNameOfRecord1495() {
		assertEquals("Lisa", customers.get(1494).getFirstName());
	}

	@Test
	@DisplayName("Record 1495: LastName is Vanbecelaere")
	void LastNameOfRecord1495() {
		assertEquals("Vanbecelaere", customers.get(1494).getLastName());
	}

	@Test
	@DisplayName("Record 1495: Company is Borenstone, Howard S Esq")
	void CompanyOfRecord1495() {
		assertEquals("Borenstone, Howard S Esq", customers.get(1494).getCompany());
	}

	@Test
	@DisplayName("Record 1495: Address is 1206 Maple Ave")
	void AddressOfRecord1495() {
		assertEquals("1206 Maple Ave", customers.get(1494).getAddress());
	}

	@Test
	@DisplayName("Record 1495: City is Burlington")
	void CityOfRecord1495() {
		assertEquals("Burlington", customers.get(1494).getCity());
	}

	@Test
	@DisplayName("Record 1495: County is Alamance")
	void CountyOfRecord1495() {
		assertEquals("Alamance", customers.get(1494).getCounty());
	}

	@Test
	@DisplayName("Record 1495: State is NC")
	void StateOfRecord1495() {
		assertEquals("NC", customers.get(1494).getState());
	}

	@Test
	@DisplayName("Record 1495: ZIP is 27215")
	void ZIPOfRecord1495() {
		assertEquals("27215", customers.get(1494).getZIP());
	}

	@Test
	@DisplayName("Record 1495: Phone is 336-226-6141")
	void PhoneOfRecord1495() {
		assertEquals("336-226-6141", customers.get(1494).getPhone());
	}

	@Test
	@DisplayName("Record 1495: Fax is 336-226-9069")
	void FaxOfRecord1495() {
		assertEquals("336-226-9069", customers.get(1494).getFax());
	}

	@Test
	@DisplayName("Record 1495: Email is lisa@vanbecelaere.com")
	void EmailOfRecord1495() {
		assertEquals("lisa@vanbecelaere.com", customers.get(1494).getEmail());
	}

	@Test
	@DisplayName("Record 1495: Web is http://www.lisavanbecelaere.com")
	void WebOfRecord1495() {
		assertEquals("http://www.lisavanbecelaere.com", customers.get(1494).getWeb());
	}
}
