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

@Tag("20")
class Record_3610 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3610: FirstName is Carole")
	void FirstNameOfRecord3610() {
		assertEquals("Carole", customers.get(3609).getFirstName());
	}

	@Test
	@DisplayName("Record 3610: LastName is Rede")
	void LastNameOfRecord3610() {
		assertEquals("Rede", customers.get(3609).getLastName());
	}

	@Test
	@DisplayName("Record 3610: Company is Wright Engineered Plastics Inc")
	void CompanyOfRecord3610() {
		assertEquals("Wright Engineered Plastics Inc", customers.get(3609).getCompany());
	}

	@Test
	@DisplayName("Record 3610: Address is 521 W Fort Island Trl")
	void AddressOfRecord3610() {
		assertEquals("521 W Fort Island Trl", customers.get(3609).getAddress());
	}

	@Test
	@DisplayName("Record 3610: City is Crystal River")
	void CityOfRecord3610() {
		assertEquals("Crystal River", customers.get(3609).getCity());
	}

	@Test
	@DisplayName("Record 3610: County is Citrus")
	void CountyOfRecord3610() {
		assertEquals("Citrus", customers.get(3609).getCounty());
	}

	@Test
	@DisplayName("Record 3610: State is FL")
	void StateOfRecord3610() {
		assertEquals("FL", customers.get(3609).getState());
	}

	@Test
	@DisplayName("Record 3610: ZIP is 34429")
	void ZIPOfRecord3610() {
		assertEquals("34429", customers.get(3609).getZIP());
	}

	@Test
	@DisplayName("Record 3610: Phone is 352-795-8659")
	void PhoneOfRecord3610() {
		assertEquals("352-795-8659", customers.get(3609).getPhone());
	}

	@Test
	@DisplayName("Record 3610: Fax is 352-795-8678")
	void FaxOfRecord3610() {
		assertEquals("352-795-8678", customers.get(3609).getFax());
	}

	@Test
	@DisplayName("Record 3610: Email is carole@rede.com")
	void EmailOfRecord3610() {
		assertEquals("carole@rede.com", customers.get(3609).getEmail());
	}

	@Test
	@DisplayName("Record 3610: Web is http://www.carolerede.com")
	void WebOfRecord3610() {
		assertEquals("http://www.carolerede.com", customers.get(3609).getWeb());
	}
}
