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

@Tag("5")
class Record_465 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 465: FirstName is Margarita")
	void FirstNameOfRecord465() {
		assertEquals("Margarita", customers.get(464).getFirstName());
	}

	@Test
	@DisplayName("Record 465: LastName is Schaupp")
	void LastNameOfRecord465() {
		assertEquals("Schaupp", customers.get(464).getLastName());
	}

	@Test
	@DisplayName("Record 465: Company is Window Fash & Intrs Ind Inc")
	void CompanyOfRecord465() {
		assertEquals("Window Fash & Intrs Ind Inc", customers.get(464).getCompany());
	}

	@Test
	@DisplayName("Record 465: Address is 9005 Miner St")
	void AddressOfRecord465() {
		assertEquals("9005 Miner St", customers.get(464).getAddress());
	}

	@Test
	@DisplayName("Record 465: City is Los Angeles")
	void CityOfRecord465() {
		assertEquals("Los Angeles", customers.get(464).getCity());
	}

	@Test
	@DisplayName("Record 465: County is Los Angeles")
	void CountyOfRecord465() {
		assertEquals("Los Angeles", customers.get(464).getCounty());
	}

	@Test
	@DisplayName("Record 465: State is CA")
	void StateOfRecord465() {
		assertEquals("CA", customers.get(464).getState());
	}

	@Test
	@DisplayName("Record 465: ZIP is 90002")
	void ZIPOfRecord465() {
		assertEquals("90002", customers.get(464).getZIP());
	}

	@Test
	@DisplayName("Record 465: Phone is 323-583-8995")
	void PhoneOfRecord465() {
		assertEquals("323-583-8995", customers.get(464).getPhone());
	}

	@Test
	@DisplayName("Record 465: Fax is 323-583-9005")
	void FaxOfRecord465() {
		assertEquals("323-583-9005", customers.get(464).getFax());
	}

	@Test
	@DisplayName("Record 465: Email is margarita@schaupp.com")
	void EmailOfRecord465() {
		assertEquals("margarita@schaupp.com", customers.get(464).getEmail());
	}

	@Test
	@DisplayName("Record 465: Web is http://www.margaritaschaupp.com")
	void WebOfRecord465() {
		assertEquals("http://www.margaritaschaupp.com", customers.get(464).getWeb());
	}
}
