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

@Tag("2")
class Record_2728 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2728: FirstName is Genevieve")
	void FirstNameOfRecord2728() {
		assertEquals("Genevieve", customers.get(2727).getFirstName());
	}

	@Test
	@DisplayName("Record 2728: LastName is Gendler")
	void LastNameOfRecord2728() {
		assertEquals("Gendler", customers.get(2727).getLastName());
	}

	@Test
	@DisplayName("Record 2728: Company is Ryder Hyl Bronze Inc")
	void CompanyOfRecord2728() {
		assertEquals("Ryder Hyl Bronze Inc", customers.get(2727).getCompany());
	}

	@Test
	@DisplayName("Record 2728: Address is 415 Walcott Rd")
	void AddressOfRecord2728() {
		assertEquals("415 Walcott Rd", customers.get(2727).getAddress());
	}

	@Test
	@DisplayName("Record 2728: City is Westlake")
	void CityOfRecord2728() {
		assertEquals("Westlake", customers.get(2727).getCity());
	}

	@Test
	@DisplayName("Record 2728: County is Calcasieu")
	void CountyOfRecord2728() {
		assertEquals("Calcasieu", customers.get(2727).getCounty());
	}

	@Test
	@DisplayName("Record 2728: State is LA")
	void StateOfRecord2728() {
		assertEquals("LA", customers.get(2727).getState());
	}

	@Test
	@DisplayName("Record 2728: ZIP is 70669")
	void ZIPOfRecord2728() {
		assertEquals("70669", customers.get(2727).getZIP());
	}

	@Test
	@DisplayName("Record 2728: Phone is 337-882-4284")
	void PhoneOfRecord2728() {
		assertEquals("337-882-4284", customers.get(2727).getPhone());
	}

	@Test
	@DisplayName("Record 2728: Fax is 337-882-9378")
	void FaxOfRecord2728() {
		assertEquals("337-882-9378", customers.get(2727).getFax());
	}

	@Test
	@DisplayName("Record 2728: Email is genevieve@gendler.com")
	void EmailOfRecord2728() {
		assertEquals("genevieve@gendler.com", customers.get(2727).getEmail());
	}

	@Test
	@DisplayName("Record 2728: Web is http://www.genevievegendler.com")
	void WebOfRecord2728() {
		assertEquals("http://www.genevievegendler.com", customers.get(2727).getWeb());
	}
}
