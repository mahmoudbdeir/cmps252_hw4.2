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
class Record_3677 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3677: FirstName is Lazaro")
	void FirstNameOfRecord3677() {
		assertEquals("Lazaro", customers.get(3676).getFirstName());
	}

	@Test
	@DisplayName("Record 3677: LastName is Mccollom")
	void LastNameOfRecord3677() {
		assertEquals("Mccollom", customers.get(3676).getLastName());
	}

	@Test
	@DisplayName("Record 3677: Company is Logan, Paul A Esq")
	void CompanyOfRecord3677() {
		assertEquals("Logan, Paul A Esq", customers.get(3676).getCompany());
	}

	@Test
	@DisplayName("Record 3677: Address is 6902 Brodie Ln")
	void AddressOfRecord3677() {
		assertEquals("6902 Brodie Ln", customers.get(3676).getAddress());
	}

	@Test
	@DisplayName("Record 3677: City is Little Rock")
	void CityOfRecord3677() {
		assertEquals("Little Rock", customers.get(3676).getCity());
	}

	@Test
	@DisplayName("Record 3677: County is Pulaski")
	void CountyOfRecord3677() {
		assertEquals("Pulaski", customers.get(3676).getCounty());
	}

	@Test
	@DisplayName("Record 3677: State is AR")
	void StateOfRecord3677() {
		assertEquals("AR", customers.get(3676).getState());
	}

	@Test
	@DisplayName("Record 3677: ZIP is 72204")
	void ZIPOfRecord3677() {
		assertEquals("72204", customers.get(3676).getZIP());
	}

	@Test
	@DisplayName("Record 3677: Phone is 501-455-9244")
	void PhoneOfRecord3677() {
		assertEquals("501-455-9244", customers.get(3676).getPhone());
	}

	@Test
	@DisplayName("Record 3677: Fax is 501-455-2791")
	void FaxOfRecord3677() {
		assertEquals("501-455-2791", customers.get(3676).getFax());
	}

	@Test
	@DisplayName("Record 3677: Email is lazaro@mccollom.com")
	void EmailOfRecord3677() {
		assertEquals("lazaro@mccollom.com", customers.get(3676).getEmail());
	}

	@Test
	@DisplayName("Record 3677: Web is http://www.lazaromccollom.com")
	void WebOfRecord3677() {
		assertEquals("http://www.lazaromccollom.com", customers.get(3676).getWeb());
	}
}
