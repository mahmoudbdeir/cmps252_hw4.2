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

@Tag("37")
class Record_2884 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2884: FirstName is Sang")
	void FirstNameOfRecord2884() {
		assertEquals("Sang", customers.get(2883).getFirstName());
	}

	@Test
	@DisplayName("Record 2884: LastName is Gossow")
	void LastNameOfRecord2884() {
		assertEquals("Gossow", customers.get(2883).getLastName());
	}

	@Test
	@DisplayName("Record 2884: Company is I B S Sipi Md")
	void CompanyOfRecord2884() {
		assertEquals("I B S Sipi Md", customers.get(2883).getCompany());
	}

	@Test
	@DisplayName("Record 2884: Address is 65 Railroad Ave")
	void AddressOfRecord2884() {
		assertEquals("65 Railroad Ave", customers.get(2883).getAddress());
	}

	@Test
	@DisplayName("Record 2884: City is Ridgefield")
	void CityOfRecord2884() {
		assertEquals("Ridgefield", customers.get(2883).getCity());
	}

	@Test
	@DisplayName("Record 2884: County is Bergen")
	void CountyOfRecord2884() {
		assertEquals("Bergen", customers.get(2883).getCounty());
	}

	@Test
	@DisplayName("Record 2884: State is NJ")
	void StateOfRecord2884() {
		assertEquals("NJ", customers.get(2883).getState());
	}

	@Test
	@DisplayName("Record 2884: ZIP is 7657")
	void ZIPOfRecord2884() {
		assertEquals("7657", customers.get(2883).getZIP());
	}

	@Test
	@DisplayName("Record 2884: Phone is 201-313-0047")
	void PhoneOfRecord2884() {
		assertEquals("201-313-0047", customers.get(2883).getPhone());
	}

	@Test
	@DisplayName("Record 2884: Fax is 201-313-9436")
	void FaxOfRecord2884() {
		assertEquals("201-313-9436", customers.get(2883).getFax());
	}

	@Test
	@DisplayName("Record 2884: Email is sang@gossow.com")
	void EmailOfRecord2884() {
		assertEquals("sang@gossow.com", customers.get(2883).getEmail());
	}

	@Test
	@DisplayName("Record 2884: Web is http://www.sanggossow.com")
	void WebOfRecord2884() {
		assertEquals("http://www.sanggossow.com", customers.get(2883).getWeb());
	}
}
