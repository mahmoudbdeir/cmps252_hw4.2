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

@Tag("22")
class Record_4228 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4228: FirstName is Pedro")
	void FirstNameOfRecord4228() {
		assertEquals("Pedro", customers.get(4227).getFirstName());
	}

	@Test
	@DisplayName("Record 4228: LastName is Eklov")
	void LastNameOfRecord4228() {
		assertEquals("Eklov", customers.get(4227).getLastName());
	}

	@Test
	@DisplayName("Record 4228: Company is Kcmc Radio Station")
	void CompanyOfRecord4228() {
		assertEquals("Kcmc Radio Station", customers.get(4227).getCompany());
	}

	@Test
	@DisplayName("Record 4228: Address is 585 State Rt 17")
	void AddressOfRecord4228() {
		assertEquals("585 State Rt 17", customers.get(4227).getAddress());
	}

	@Test
	@DisplayName("Record 4228: City is Ramsey")
	void CityOfRecord4228() {
		assertEquals("Ramsey", customers.get(4227).getCity());
	}

	@Test
	@DisplayName("Record 4228: County is Bergen")
	void CountyOfRecord4228() {
		assertEquals("Bergen", customers.get(4227).getCounty());
	}

	@Test
	@DisplayName("Record 4228: State is NJ")
	void StateOfRecord4228() {
		assertEquals("NJ", customers.get(4227).getState());
	}

	@Test
	@DisplayName("Record 4228: ZIP is 7446")
	void ZIPOfRecord4228() {
		assertEquals("7446", customers.get(4227).getZIP());
	}

	@Test
	@DisplayName("Record 4228: Phone is 201-327-3414")
	void PhoneOfRecord4228() {
		assertEquals("201-327-3414", customers.get(4227).getPhone());
	}

	@Test
	@DisplayName("Record 4228: Fax is 201-327-8104")
	void FaxOfRecord4228() {
		assertEquals("201-327-8104", customers.get(4227).getFax());
	}

	@Test
	@DisplayName("Record 4228: Email is pedro@eklov.com")
	void EmailOfRecord4228() {
		assertEquals("pedro@eklov.com", customers.get(4227).getEmail());
	}

	@Test
	@DisplayName("Record 4228: Web is http://www.pedroeklov.com")
	void WebOfRecord4228() {
		assertEquals("http://www.pedroeklov.com", customers.get(4227).getWeb());
	}
}
