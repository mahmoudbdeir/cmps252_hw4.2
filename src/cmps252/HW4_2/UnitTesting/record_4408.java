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

@Tag("14")
class Record_4408 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4408: FirstName is Taylor")
	void FirstNameOfRecord4408() {
		assertEquals("Taylor", customers.get(4407).getFirstName());
	}

	@Test
	@DisplayName("Record 4408: LastName is Matuszeski")
	void LastNameOfRecord4408() {
		assertEquals("Matuszeski", customers.get(4407).getLastName());
	}

	@Test
	@DisplayName("Record 4408: Company is E F Lane & Son")
	void CompanyOfRecord4408() {
		assertEquals("E F Lane & Son", customers.get(4407).getCompany());
	}

	@Test
	@DisplayName("Record 4408: Address is 201 E Jackson St  #-300")
	void AddressOfRecord4408() {
		assertEquals("201 E Jackson St  #-300", customers.get(4407).getAddress());
	}

	@Test
	@DisplayName("Record 4408: City is Muncie")
	void CityOfRecord4408() {
		assertEquals("Muncie", customers.get(4407).getCity());
	}

	@Test
	@DisplayName("Record 4408: County is Delaware")
	void CountyOfRecord4408() {
		assertEquals("Delaware", customers.get(4407).getCounty());
	}

	@Test
	@DisplayName("Record 4408: State is IN")
	void StateOfRecord4408() {
		assertEquals("IN", customers.get(4407).getState());
	}

	@Test
	@DisplayName("Record 4408: ZIP is 47305")
	void ZIPOfRecord4408() {
		assertEquals("47305", customers.get(4407).getZIP());
	}

	@Test
	@DisplayName("Record 4408: Phone is 765-289-5121")
	void PhoneOfRecord4408() {
		assertEquals("765-289-5121", customers.get(4407).getPhone());
	}

	@Test
	@DisplayName("Record 4408: Fax is 765-289-6981")
	void FaxOfRecord4408() {
		assertEquals("765-289-6981", customers.get(4407).getFax());
	}

	@Test
	@DisplayName("Record 4408: Email is taylor@matuszeski.com")
	void EmailOfRecord4408() {
		assertEquals("taylor@matuszeski.com", customers.get(4407).getEmail());
	}

	@Test
	@DisplayName("Record 4408: Web is http://www.taylormatuszeski.com")
	void WebOfRecord4408() {
		assertEquals("http://www.taylormatuszeski.com", customers.get(4407).getWeb());
	}
}
