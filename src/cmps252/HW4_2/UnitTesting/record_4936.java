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
class Record_4936 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4936: FirstName is Violet")
	void FirstNameOfRecord4936() {
		assertEquals("Violet", customers.get(4935).getFirstName());
	}

	@Test
	@DisplayName("Record 4936: LastName is Sud")
	void LastNameOfRecord4936() {
		assertEquals("Sud", customers.get(4935).getLastName());
	}

	@Test
	@DisplayName("Record 4936: Company is Beck, Richard E Esq")
	void CompanyOfRecord4936() {
		assertEquals("Beck, Richard E Esq", customers.get(4935).getCompany());
	}

	@Test
	@DisplayName("Record 4936: Address is 10 N Calvert St")
	void AddressOfRecord4936() {
		assertEquals("10 N Calvert St", customers.get(4935).getAddress());
	}

	@Test
	@DisplayName("Record 4936: City is Baltimore")
	void CityOfRecord4936() {
		assertEquals("Baltimore", customers.get(4935).getCity());
	}

	@Test
	@DisplayName("Record 4936: County is Baltimore City")
	void CountyOfRecord4936() {
		assertEquals("Baltimore City", customers.get(4935).getCounty());
	}

	@Test
	@DisplayName("Record 4936: State is MD")
	void StateOfRecord4936() {
		assertEquals("MD", customers.get(4935).getState());
	}

	@Test
	@DisplayName("Record 4936: ZIP is 21202")
	void ZIPOfRecord4936() {
		assertEquals("21202", customers.get(4935).getZIP());
	}

	@Test
	@DisplayName("Record 4936: Phone is 410-659-2248")
	void PhoneOfRecord4936() {
		assertEquals("410-659-2248", customers.get(4935).getPhone());
	}

	@Test
	@DisplayName("Record 4936: Fax is 410-659-6864")
	void FaxOfRecord4936() {
		assertEquals("410-659-6864", customers.get(4935).getFax());
	}

	@Test
	@DisplayName("Record 4936: Email is violet@sud.com")
	void EmailOfRecord4936() {
		assertEquals("violet@sud.com", customers.get(4935).getEmail());
	}

	@Test
	@DisplayName("Record 4936: Web is http://www.violetsud.com")
	void WebOfRecord4936() {
		assertEquals("http://www.violetsud.com", customers.get(4935).getWeb());
	}
}
