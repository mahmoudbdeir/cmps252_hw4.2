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

@Tag("35")
class Record_4400 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4400: FirstName is Lauri")
	void FirstNameOfRecord4400() {
		assertEquals("Lauri", customers.get(4399).getFirstName());
	}

	@Test
	@DisplayName("Record 4400: LastName is Wolpe")
	void LastNameOfRecord4400() {
		assertEquals("Wolpe", customers.get(4399).getLastName());
	}

	@Test
	@DisplayName("Record 4400: Company is Jay Bee Products Corp")
	void CompanyOfRecord4400() {
		assertEquals("Jay Bee Products Corp", customers.get(4399).getCompany());
	}

	@Test
	@DisplayName("Record 4400: Address is 620 Cross St")
	void AddressOfRecord4400() {
		assertEquals("620 Cross St", customers.get(4399).getAddress());
	}

	@Test
	@DisplayName("Record 4400: City is Beloit")
	void CityOfRecord4400() {
		assertEquals("Beloit", customers.get(4399).getCity());
	}

	@Test
	@DisplayName("Record 4400: County is Rock")
	void CountyOfRecord4400() {
		assertEquals("Rock", customers.get(4399).getCounty());
	}

	@Test
	@DisplayName("Record 4400: State is WI")
	void StateOfRecord4400() {
		assertEquals("WI", customers.get(4399).getState());
	}

	@Test
	@DisplayName("Record 4400: ZIP is 53511")
	void ZIPOfRecord4400() {
		assertEquals("53511", customers.get(4399).getZIP());
	}

	@Test
	@DisplayName("Record 4400: Phone is 608-362-2834")
	void PhoneOfRecord4400() {
		assertEquals("608-362-2834", customers.get(4399).getPhone());
	}

	@Test
	@DisplayName("Record 4400: Fax is 608-362-8443")
	void FaxOfRecord4400() {
		assertEquals("608-362-8443", customers.get(4399).getFax());
	}

	@Test
	@DisplayName("Record 4400: Email is lauri@wolpe.com")
	void EmailOfRecord4400() {
		assertEquals("lauri@wolpe.com", customers.get(4399).getEmail());
	}

	@Test
	@DisplayName("Record 4400: Web is http://www.lauriwolpe.com")
	void WebOfRecord4400() {
		assertEquals("http://www.lauriwolpe.com", customers.get(4399).getWeb());
	}
}
