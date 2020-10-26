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

@Tag("23")
class Record_995 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 995: FirstName is Neva")
	void FirstNameOfRecord995() {
		assertEquals("Neva", customers.get(994).getFirstName());
	}

	@Test
	@DisplayName("Record 995: LastName is Guerrido")
	void LastNameOfRecord995() {
		assertEquals("Guerrido", customers.get(994).getLastName());
	}

	@Test
	@DisplayName("Record 995: Company is Simon, Ronald A Md")
	void CompanyOfRecord995() {
		assertEquals("Simon, Ronald A Md", customers.get(994).getCompany());
	}

	@Test
	@DisplayName("Record 995: Address is 3411 Yankee Rd")
	void AddressOfRecord995() {
		assertEquals("3411 Yankee Rd", customers.get(994).getAddress());
	}

	@Test
	@DisplayName("Record 995: City is Middletown")
	void CityOfRecord995() {
		assertEquals("Middletown", customers.get(994).getCity());
	}

	@Test
	@DisplayName("Record 995: County is Butler")
	void CountyOfRecord995() {
		assertEquals("Butler", customers.get(994).getCounty());
	}

	@Test
	@DisplayName("Record 995: State is OH")
	void StateOfRecord995() {
		assertEquals("OH", customers.get(994).getState());
	}

	@Test
	@DisplayName("Record 995: ZIP is 45044")
	void ZIPOfRecord995() {
		assertEquals("45044", customers.get(994).getZIP());
	}

	@Test
	@DisplayName("Record 995: Phone is 513-424-2024")
	void PhoneOfRecord995() {
		assertEquals("513-424-2024", customers.get(994).getPhone());
	}

	@Test
	@DisplayName("Record 995: Fax is 513-424-6354")
	void FaxOfRecord995() {
		assertEquals("513-424-6354", customers.get(994).getFax());
	}

	@Test
	@DisplayName("Record 995: Email is neva@guerrido.com")
	void EmailOfRecord995() {
		assertEquals("neva@guerrido.com", customers.get(994).getEmail());
	}

	@Test
	@DisplayName("Record 995: Web is http://www.nevaguerrido.com")
	void WebOfRecord995() {
		assertEquals("http://www.nevaguerrido.com", customers.get(994).getWeb());
	}
}
