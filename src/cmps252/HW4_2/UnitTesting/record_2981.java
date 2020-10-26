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

@Tag("46")
class Record_2981 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2981: FirstName is Royce")
	void FirstNameOfRecord2981() {
		assertEquals("Royce", customers.get(2980).getFirstName());
	}

	@Test
	@DisplayName("Record 2981: LastName is Wordell")
	void LastNameOfRecord2981() {
		assertEquals("Wordell", customers.get(2980).getLastName());
	}

	@Test
	@DisplayName("Record 2981: Company is Deluca, Tullio Esq")
	void CompanyOfRecord2981() {
		assertEquals("Deluca, Tullio Esq", customers.get(2980).getCompany());
	}

	@Test
	@DisplayName("Record 2981: Address is 4933 Bethesda Ave")
	void AddressOfRecord2981() {
		assertEquals("4933 Bethesda Ave", customers.get(2980).getAddress());
	}

	@Test
	@DisplayName("Record 2981: City is Bethesda")
	void CityOfRecord2981() {
		assertEquals("Bethesda", customers.get(2980).getCity());
	}

	@Test
	@DisplayName("Record 2981: County is Montgomery")
	void CountyOfRecord2981() {
		assertEquals("Montgomery", customers.get(2980).getCounty());
	}

	@Test
	@DisplayName("Record 2981: State is MD")
	void StateOfRecord2981() {
		assertEquals("MD", customers.get(2980).getState());
	}

	@Test
	@DisplayName("Record 2981: ZIP is 20814")
	void ZIPOfRecord2981() {
		assertEquals("20814", customers.get(2980).getZIP());
	}

	@Test
	@DisplayName("Record 2981: Phone is 301-652-8574")
	void PhoneOfRecord2981() {
		assertEquals("301-652-8574", customers.get(2980).getPhone());
	}

	@Test
	@DisplayName("Record 2981: Fax is 301-652-7426")
	void FaxOfRecord2981() {
		assertEquals("301-652-7426", customers.get(2980).getFax());
	}

	@Test
	@DisplayName("Record 2981: Email is royce@wordell.com")
	void EmailOfRecord2981() {
		assertEquals("royce@wordell.com", customers.get(2980).getEmail());
	}

	@Test
	@DisplayName("Record 2981: Web is http://www.roycewordell.com")
	void WebOfRecord2981() {
		assertEquals("http://www.roycewordell.com", customers.get(2980).getWeb());
	}
}
