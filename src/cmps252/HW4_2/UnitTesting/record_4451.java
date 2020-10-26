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

@Tag("1")
class Record_4451 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4451: FirstName is Mariano")
	void FirstNameOfRecord4451() {
		assertEquals("Mariano", customers.get(4450).getFirstName());
	}

	@Test
	@DisplayName("Record 4451: LastName is Mall")
	void LastNameOfRecord4451() {
		assertEquals("Mall", customers.get(4450).getLastName());
	}

	@Test
	@DisplayName("Record 4451: Company is Construction Market Data Inc")
	void CompanyOfRecord4451() {
		assertEquals("Construction Market Data Inc", customers.get(4450).getCompany());
	}

	@Test
	@DisplayName("Record 4451: Address is 400 Commons Way")
	void AddressOfRecord4451() {
		assertEquals("400 Commons Way", customers.get(4450).getAddress());
	}

	@Test
	@DisplayName("Record 4451: City is Bridgewater")
	void CityOfRecord4451() {
		assertEquals("Bridgewater", customers.get(4450).getCity());
	}

	@Test
	@DisplayName("Record 4451: County is Somerset")
	void CountyOfRecord4451() {
		assertEquals("Somerset", customers.get(4450).getCounty());
	}

	@Test
	@DisplayName("Record 4451: State is NJ")
	void StateOfRecord4451() {
		assertEquals("NJ", customers.get(4450).getState());
	}

	@Test
	@DisplayName("Record 4451: ZIP is 8807")
	void ZIPOfRecord4451() {
		assertEquals("8807", customers.get(4450).getZIP());
	}

	@Test
	@DisplayName("Record 4451: Phone is 908-725-9249")
	void PhoneOfRecord4451() {
		assertEquals("908-725-9249", customers.get(4450).getPhone());
	}

	@Test
	@DisplayName("Record 4451: Fax is 908-725-0008")
	void FaxOfRecord4451() {
		assertEquals("908-725-0008", customers.get(4450).getFax());
	}

	@Test
	@DisplayName("Record 4451: Email is mariano@mall.com")
	void EmailOfRecord4451() {
		assertEquals("mariano@mall.com", customers.get(4450).getEmail());
	}

	@Test
	@DisplayName("Record 4451: Web is http://www.marianomall.com")
	void WebOfRecord4451() {
		assertEquals("http://www.marianomall.com", customers.get(4450).getWeb());
	}
}
