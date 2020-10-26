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

@Tag("40")
class Record_2200 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2200: FirstName is Sylvia")
	void FirstNameOfRecord2200() {
		assertEquals("Sylvia", customers.get(2199).getFirstName());
	}

	@Test
	@DisplayName("Record 2200: LastName is Schillings")
	void LastNameOfRecord2200() {
		assertEquals("Schillings", customers.get(2199).getLastName());
	}

	@Test
	@DisplayName("Record 2200: Company is Irridelco International")
	void CompanyOfRecord2200() {
		assertEquals("Irridelco International", customers.get(2199).getCompany());
	}

	@Test
	@DisplayName("Record 2200: Address is Rr 1")
	void AddressOfRecord2200() {
		assertEquals("Rr 1", customers.get(2199).getAddress());
	}

	@Test
	@DisplayName("Record 2200: City is Strafford")
	void CityOfRecord2200() {
		assertEquals("Strafford", customers.get(2199).getCity());
	}

	@Test
	@DisplayName("Record 2200: County is Greene")
	void CountyOfRecord2200() {
		assertEquals("Greene", customers.get(2199).getCounty());
	}

	@Test
	@DisplayName("Record 2200: State is MO")
	void StateOfRecord2200() {
		assertEquals("MO", customers.get(2199).getState());
	}

	@Test
	@DisplayName("Record 2200: ZIP is 65757")
	void ZIPOfRecord2200() {
		assertEquals("65757", customers.get(2199).getZIP());
	}

	@Test
	@DisplayName("Record 2200: Phone is 417-736-2912")
	void PhoneOfRecord2200() {
		assertEquals("417-736-2912", customers.get(2199).getPhone());
	}

	@Test
	@DisplayName("Record 2200: Fax is 417-736-0425")
	void FaxOfRecord2200() {
		assertEquals("417-736-0425", customers.get(2199).getFax());
	}

	@Test
	@DisplayName("Record 2200: Email is sylvia@schillings.com")
	void EmailOfRecord2200() {
		assertEquals("sylvia@schillings.com", customers.get(2199).getEmail());
	}

	@Test
	@DisplayName("Record 2200: Web is http://www.sylviaschillings.com")
	void WebOfRecord2200() {
		assertEquals("http://www.sylviaschillings.com", customers.get(2199).getWeb());
	}
}
