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

@Tag("11")
class Record_4549 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4549: FirstName is Abe")
	void FirstNameOfRecord4549() {
		assertEquals("Abe", customers.get(4548).getFirstName());
	}

	@Test
	@DisplayName("Record 4549: LastName is Dykstra")
	void LastNameOfRecord4549() {
		assertEquals("Dykstra", customers.get(4548).getLastName());
	}

	@Test
	@DisplayName("Record 4549: Company is Prudential The Ne Grp")
	void CompanyOfRecord4549() {
		assertEquals("Prudential The Ne Grp", customers.get(4548).getCompany());
	}

	@Test
	@DisplayName("Record 4549: Address is 800 Delaware Ave  #-100")
	void AddressOfRecord4549() {
		assertEquals("800 Delaware Ave  #-100", customers.get(4548).getAddress());
	}

	@Test
	@DisplayName("Record 4549: City is Wilmington")
	void CityOfRecord4549() {
		assertEquals("Wilmington", customers.get(4548).getCity());
	}

	@Test
	@DisplayName("Record 4549: County is New Castle")
	void CountyOfRecord4549() {
		assertEquals("New Castle", customers.get(4548).getCounty());
	}

	@Test
	@DisplayName("Record 4549: State is DE")
	void StateOfRecord4549() {
		assertEquals("DE", customers.get(4548).getState());
	}

	@Test
	@DisplayName("Record 4549: ZIP is 19801")
	void ZIPOfRecord4549() {
		assertEquals("19801", customers.get(4548).getZIP());
	}

	@Test
	@DisplayName("Record 4549: Phone is 302-656-4726")
	void PhoneOfRecord4549() {
		assertEquals("302-656-4726", customers.get(4548).getPhone());
	}

	@Test
	@DisplayName("Record 4549: Fax is 302-656-6033")
	void FaxOfRecord4549() {
		assertEquals("302-656-6033", customers.get(4548).getFax());
	}

	@Test
	@DisplayName("Record 4549: Email is abe@dykstra.com")
	void EmailOfRecord4549() {
		assertEquals("abe@dykstra.com", customers.get(4548).getEmail());
	}

	@Test
	@DisplayName("Record 4549: Web is http://www.abedykstra.com")
	void WebOfRecord4549() {
		assertEquals("http://www.abedykstra.com", customers.get(4548).getWeb());
	}
}
