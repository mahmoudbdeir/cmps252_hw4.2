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
class Record_3066 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3066: FirstName is Cristobal")
	void FirstNameOfRecord3066() {
		assertEquals("Cristobal", customers.get(3065).getFirstName());
	}

	@Test
	@DisplayName("Record 3066: LastName is Gertsen")
	void LastNameOfRecord3066() {
		assertEquals("Gertsen", customers.get(3065).getLastName());
	}

	@Test
	@DisplayName("Record 3066: Company is Kentucky Corporate Fed Crdt Un")
	void CompanyOfRecord3066() {
		assertEquals("Kentucky Corporate Fed Crdt Un", customers.get(3065).getCompany());
	}

	@Test
	@DisplayName("Record 3066: Address is 645 N Michigan Ave")
	void AddressOfRecord3066() {
		assertEquals("645 N Michigan Ave", customers.get(3065).getAddress());
	}

	@Test
	@DisplayName("Record 3066: City is Chicago")
	void CityOfRecord3066() {
		assertEquals("Chicago", customers.get(3065).getCity());
	}

	@Test
	@DisplayName("Record 3066: County is Cook")
	void CountyOfRecord3066() {
		assertEquals("Cook", customers.get(3065).getCounty());
	}

	@Test
	@DisplayName("Record 3066: State is IL")
	void StateOfRecord3066() {
		assertEquals("IL", customers.get(3065).getState());
	}

	@Test
	@DisplayName("Record 3066: ZIP is 60611")
	void ZIPOfRecord3066() {
		assertEquals("60611", customers.get(3065).getZIP());
	}

	@Test
	@DisplayName("Record 3066: Phone is 312-751-4674")
	void PhoneOfRecord3066() {
		assertEquals("312-751-4674", customers.get(3065).getPhone());
	}

	@Test
	@DisplayName("Record 3066: Fax is 312-751-4355")
	void FaxOfRecord3066() {
		assertEquals("312-751-4355", customers.get(3065).getFax());
	}

	@Test
	@DisplayName("Record 3066: Email is cristobal@gertsen.com")
	void EmailOfRecord3066() {
		assertEquals("cristobal@gertsen.com", customers.get(3065).getEmail());
	}

	@Test
	@DisplayName("Record 3066: Web is http://www.cristobalgertsen.com")
	void WebOfRecord3066() {
		assertEquals("http://www.cristobalgertsen.com", customers.get(3065).getWeb());
	}
}
