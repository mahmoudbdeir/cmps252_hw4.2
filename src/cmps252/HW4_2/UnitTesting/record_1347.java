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

@Tag("34")
class Record_1347 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1347: FirstName is Demetrius")
	void FirstNameOfRecord1347() {
		assertEquals("Demetrius", customers.get(1346).getFirstName());
	}

	@Test
	@DisplayName("Record 1347: LastName is Medanich")
	void LastNameOfRecord1347() {
		assertEquals("Medanich", customers.get(1346).getLastName());
	}

	@Test
	@DisplayName("Record 1347: Company is Wava Radio 105 Fm")
	void CompanyOfRecord1347() {
		assertEquals("Wava Radio 105 Fm", customers.get(1346).getCompany());
	}

	@Test
	@DisplayName("Record 1347: Address is 34 Vandever Ave")
	void AddressOfRecord1347() {
		assertEquals("34 Vandever Ave", customers.get(1346).getAddress());
	}

	@Test
	@DisplayName("Record 1347: City is Wilmington")
	void CityOfRecord1347() {
		assertEquals("Wilmington", customers.get(1346).getCity());
	}

	@Test
	@DisplayName("Record 1347: County is New Castle")
	void CountyOfRecord1347() {
		assertEquals("New Castle", customers.get(1346).getCounty());
	}

	@Test
	@DisplayName("Record 1347: State is DE")
	void StateOfRecord1347() {
		assertEquals("DE", customers.get(1346).getState());
	}

	@Test
	@DisplayName("Record 1347: ZIP is 19802")
	void ZIPOfRecord1347() {
		assertEquals("19802", customers.get(1346).getZIP());
	}

	@Test
	@DisplayName("Record 1347: Phone is 302-652-4304")
	void PhoneOfRecord1347() {
		assertEquals("302-652-4304", customers.get(1346).getPhone());
	}

	@Test
	@DisplayName("Record 1347: Fax is 302-652-4787")
	void FaxOfRecord1347() {
		assertEquals("302-652-4787", customers.get(1346).getFax());
	}

	@Test
	@DisplayName("Record 1347: Email is demetrius@medanich.com")
	void EmailOfRecord1347() {
		assertEquals("demetrius@medanich.com", customers.get(1346).getEmail());
	}

	@Test
	@DisplayName("Record 1347: Web is http://www.demetriusmedanich.com")
	void WebOfRecord1347() {
		assertEquals("http://www.demetriusmedanich.com", customers.get(1346).getWeb());
	}
}
