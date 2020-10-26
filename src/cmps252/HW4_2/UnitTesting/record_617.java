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

@Tag("9")
class Record_617 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 617: FirstName is Josiah")
	void FirstNameOfRecord617() {
		assertEquals("Josiah", customers.get(616).getFirstName());
	}

	@Test
	@DisplayName("Record 617: LastName is Avance")
	void LastNameOfRecord617() {
		assertEquals("Avance", customers.get(616).getLastName());
	}

	@Test
	@DisplayName("Record 617: Company is Ge Hitachi Hvb Inc")
	void CompanyOfRecord617() {
		assertEquals("Ge Hitachi Hvb Inc", customers.get(616).getCompany());
	}

	@Test
	@DisplayName("Record 617: Address is 1420 State Hwy  #-53")
	void AddressOfRecord617() {
		assertEquals("1420 State Hwy  #-53", customers.get(616).getAddress());
	}

	@Test
	@DisplayName("Record 617: City is Mount Tabor")
	void CityOfRecord617() {
		assertEquals("Mount Tabor", customers.get(616).getCity());
	}

	@Test
	@DisplayName("Record 617: County is Morris")
	void CountyOfRecord617() {
		assertEquals("Morris", customers.get(616).getCounty());
	}

	@Test
	@DisplayName("Record 617: State is NJ")
	void StateOfRecord617() {
		assertEquals("NJ", customers.get(616).getState());
	}

	@Test
	@DisplayName("Record 617: ZIP is 7878")
	void ZIPOfRecord617() {
		assertEquals("7878", customers.get(616).getZIP());
	}

	@Test
	@DisplayName("Record 617: Phone is 973-627-8762")
	void PhoneOfRecord617() {
		assertEquals("973-627-8762", customers.get(616).getPhone());
	}

	@Test
	@DisplayName("Record 617: Fax is 973-627-6057")
	void FaxOfRecord617() {
		assertEquals("973-627-6057", customers.get(616).getFax());
	}

	@Test
	@DisplayName("Record 617: Email is josiah@avance.com")
	void EmailOfRecord617() {
		assertEquals("josiah@avance.com", customers.get(616).getEmail());
	}

	@Test
	@DisplayName("Record 617: Web is http://www.josiahavance.com")
	void WebOfRecord617() {
		assertEquals("http://www.josiahavance.com", customers.get(616).getWeb());
	}
}
