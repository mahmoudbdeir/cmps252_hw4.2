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

@Tag("4")
class Record_1122 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1122: FirstName is Lashawn")
	void FirstNameOfRecord1122() {
		assertEquals("Lashawn", customers.get(1121).getFirstName());
	}

	@Test
	@DisplayName("Record 1122: LastName is Kazmierczak")
	void LastNameOfRecord1122() {
		assertEquals("Kazmierczak", customers.get(1121).getLastName());
	}

	@Test
	@DisplayName("Record 1122: Company is Williams, Roch T Esq")
	void CompanyOfRecord1122() {
		assertEquals("Williams, Roch T Esq", customers.get(1121).getCompany());
	}

	@Test
	@DisplayName("Record 1122: Address is 4519 Bennett Rd")
	void AddressOfRecord1122() {
		assertEquals("4519 Bennett Rd", customers.get(1121).getAddress());
	}

	@Test
	@DisplayName("Record 1122: City is Toledo")
	void CityOfRecord1122() {
		assertEquals("Toledo", customers.get(1121).getCity());
	}

	@Test
	@DisplayName("Record 1122: County is Lucas")
	void CountyOfRecord1122() {
		assertEquals("Lucas", customers.get(1121).getCounty());
	}

	@Test
	@DisplayName("Record 1122: State is OH")
	void StateOfRecord1122() {
		assertEquals("OH", customers.get(1121).getState());
	}

	@Test
	@DisplayName("Record 1122: ZIP is 43612")
	void ZIPOfRecord1122() {
		assertEquals("43612", customers.get(1121).getZIP());
	}

	@Test
	@DisplayName("Record 1122: Phone is 419-470-6817")
	void PhoneOfRecord1122() {
		assertEquals("419-470-6817", customers.get(1121).getPhone());
	}

	@Test
	@DisplayName("Record 1122: Fax is 419-470-3966")
	void FaxOfRecord1122() {
		assertEquals("419-470-3966", customers.get(1121).getFax());
	}

	@Test
	@DisplayName("Record 1122: Email is lashawn@kazmierczak.com")
	void EmailOfRecord1122() {
		assertEquals("lashawn@kazmierczak.com", customers.get(1121).getEmail());
	}

	@Test
	@DisplayName("Record 1122: Web is http://www.lashawnkazmierczak.com")
	void WebOfRecord1122() {
		assertEquals("http://www.lashawnkazmierczak.com", customers.get(1121).getWeb());
	}
}
