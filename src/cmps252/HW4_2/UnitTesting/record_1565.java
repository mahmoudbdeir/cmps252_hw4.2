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
class Record_1565 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1565: FirstName is Doretha")
	void FirstNameOfRecord1565() {
		assertEquals("Doretha", customers.get(1564).getFirstName());
	}

	@Test
	@DisplayName("Record 1565: LastName is Damann")
	void LastNameOfRecord1565() {
		assertEquals("Damann", customers.get(1564).getLastName());
	}

	@Test
	@DisplayName("Record 1565: Company is Ryder Truck Rental One Way Inc")
	void CompanyOfRecord1565() {
		assertEquals("Ryder Truck Rental One Way Inc", customers.get(1564).getCompany());
	}

	@Test
	@DisplayName("Record 1565: Address is 112 Sidney St")
	void AddressOfRecord1565() {
		assertEquals("112 Sidney St", customers.get(1564).getAddress());
	}

	@Test
	@DisplayName("Record 1565: City is Saint Louis")
	void CityOfRecord1565() {
		assertEquals("Saint Louis", customers.get(1564).getCity());
	}

	@Test
	@DisplayName("Record 1565: County is Saint Louis City")
	void CountyOfRecord1565() {
		assertEquals("Saint Louis City", customers.get(1564).getCounty());
	}

	@Test
	@DisplayName("Record 1565: State is MO")
	void StateOfRecord1565() {
		assertEquals("MO", customers.get(1564).getState());
	}

	@Test
	@DisplayName("Record 1565: ZIP is 63104")
	void ZIPOfRecord1565() {
		assertEquals("63104", customers.get(1564).getZIP());
	}

	@Test
	@DisplayName("Record 1565: Phone is 314-773-1899")
	void PhoneOfRecord1565() {
		assertEquals("314-773-1899", customers.get(1564).getPhone());
	}

	@Test
	@DisplayName("Record 1565: Fax is 314-773-1664")
	void FaxOfRecord1565() {
		assertEquals("314-773-1664", customers.get(1564).getFax());
	}

	@Test
	@DisplayName("Record 1565: Email is doretha@damann.com")
	void EmailOfRecord1565() {
		assertEquals("doretha@damann.com", customers.get(1564).getEmail());
	}

	@Test
	@DisplayName("Record 1565: Web is http://www.dorethadamann.com")
	void WebOfRecord1565() {
		assertEquals("http://www.dorethadamann.com", customers.get(1564).getWeb());
	}
}
