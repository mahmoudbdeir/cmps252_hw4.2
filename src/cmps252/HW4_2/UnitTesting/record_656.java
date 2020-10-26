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

@Tag("6")
class Record_656 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 656: FirstName is Adela")
	void FirstNameOfRecord656() {
		assertEquals("Adela", customers.get(655).getFirstName());
	}

	@Test
	@DisplayName("Record 656: LastName is Ellison")
	void LastNameOfRecord656() {
		assertEquals("Ellison", customers.get(655).getLastName());
	}

	@Test
	@DisplayName("Record 656: Company is Hiebert, David L Esq")
	void CompanyOfRecord656() {
		assertEquals("Hiebert, David L Esq", customers.get(655).getCompany());
	}

	@Test
	@DisplayName("Record 656: Address is 4395 S Parsons Ave")
	void AddressOfRecord656() {
		assertEquals("4395 S Parsons Ave", customers.get(655).getAddress());
	}

	@Test
	@DisplayName("Record 656: City is Fremont")
	void CityOfRecord656() {
		assertEquals("Fremont", customers.get(655).getCity());
	}

	@Test
	@DisplayName("Record 656: County is Newaygo")
	void CountyOfRecord656() {
		assertEquals("Newaygo", customers.get(655).getCounty());
	}

	@Test
	@DisplayName("Record 656: State is MI")
	void StateOfRecord656() {
		assertEquals("MI", customers.get(655).getState());
	}

	@Test
	@DisplayName("Record 656: ZIP is 49412")
	void ZIPOfRecord656() {
		assertEquals("49412", customers.get(655).getZIP());
	}

	@Test
	@DisplayName("Record 656: Phone is 231-924-1082")
	void PhoneOfRecord656() {
		assertEquals("231-924-1082", customers.get(655).getPhone());
	}

	@Test
	@DisplayName("Record 656: Fax is 231-924-6748")
	void FaxOfRecord656() {
		assertEquals("231-924-6748", customers.get(655).getFax());
	}

	@Test
	@DisplayName("Record 656: Email is adela@ellison.com")
	void EmailOfRecord656() {
		assertEquals("adela@ellison.com", customers.get(655).getEmail());
	}

	@Test
	@DisplayName("Record 656: Web is http://www.adelaellison.com")
	void WebOfRecord656() {
		assertEquals("http://www.adelaellison.com", customers.get(655).getWeb());
	}
}
