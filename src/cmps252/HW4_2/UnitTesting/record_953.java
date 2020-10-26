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

@Tag("47")
class Record_953 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 953: FirstName is Jacquelyn")
	void FirstNameOfRecord953() {
		assertEquals("Jacquelyn", customers.get(952).getFirstName());
	}

	@Test
	@DisplayName("Record 953: LastName is Nazzise")
	void LastNameOfRecord953() {
		assertEquals("Nazzise", customers.get(952).getLastName());
	}

	@Test
	@DisplayName("Record 953: Company is Sportsmans Supply Co")
	void CompanyOfRecord953() {
		assertEquals("Sportsmans Supply Co", customers.get(952).getCompany());
	}

	@Test
	@DisplayName("Record 953: Address is 1931 Mateo St")
	void AddressOfRecord953() {
		assertEquals("1931 Mateo St", customers.get(952).getAddress());
	}

	@Test
	@DisplayName("Record 953: City is Los Angeles")
	void CityOfRecord953() {
		assertEquals("Los Angeles", customers.get(952).getCity());
	}

	@Test
	@DisplayName("Record 953: County is Los Angeles")
	void CountyOfRecord953() {
		assertEquals("Los Angeles", customers.get(952).getCounty());
	}

	@Test
	@DisplayName("Record 953: State is CA")
	void StateOfRecord953() {
		assertEquals("CA", customers.get(952).getState());
	}

	@Test
	@DisplayName("Record 953: ZIP is 90021")
	void ZIPOfRecord953() {
		assertEquals("90021", customers.get(952).getZIP());
	}

	@Test
	@DisplayName("Record 953: Phone is 213-627-9500")
	void PhoneOfRecord953() {
		assertEquals("213-627-9500", customers.get(952).getPhone());
	}

	@Test
	@DisplayName("Record 953: Fax is 213-627-6118")
	void FaxOfRecord953() {
		assertEquals("213-627-6118", customers.get(952).getFax());
	}

	@Test
	@DisplayName("Record 953: Email is jacquelyn@nazzise.com")
	void EmailOfRecord953() {
		assertEquals("jacquelyn@nazzise.com", customers.get(952).getEmail());
	}

	@Test
	@DisplayName("Record 953: Web is http://www.jacquelynnazzise.com")
	void WebOfRecord953() {
		assertEquals("http://www.jacquelynnazzise.com", customers.get(952).getWeb());
	}
}
