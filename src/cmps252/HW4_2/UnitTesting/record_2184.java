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
class Record_2184 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2184: FirstName is Edward")
	void FirstNameOfRecord2184() {
		assertEquals("Edward", customers.get(2183).getFirstName());
	}

	@Test
	@DisplayName("Record 2184: LastName is Cubit")
	void LastNameOfRecord2184() {
		assertEquals("Cubit", customers.get(2183).getLastName());
	}

	@Test
	@DisplayName("Record 2184: Company is R M D Signs")
	void CompanyOfRecord2184() {
		assertEquals("R M D Signs", customers.get(2183).getCompany());
	}

	@Test
	@DisplayName("Record 2184: Address is 11 Rivington")
	void AddressOfRecord2184() {
		assertEquals("11 Rivington", customers.get(2183).getAddress());
	}

	@Test
	@DisplayName("Record 2184: City is New York")
	void CityOfRecord2184() {
		assertEquals("New York", customers.get(2183).getCity());
	}

	@Test
	@DisplayName("Record 2184: County is New York")
	void CountyOfRecord2184() {
		assertEquals("New York", customers.get(2183).getCounty());
	}

	@Test
	@DisplayName("Record 2184: State is NY")
	void StateOfRecord2184() {
		assertEquals("NY", customers.get(2183).getState());
	}

	@Test
	@DisplayName("Record 2184: ZIP is 10002")
	void ZIPOfRecord2184() {
		assertEquals("10002", customers.get(2183).getZIP());
	}

	@Test
	@DisplayName("Record 2184: Phone is 212-979-0946")
	void PhoneOfRecord2184() {
		assertEquals("212-979-0946", customers.get(2183).getPhone());
	}

	@Test
	@DisplayName("Record 2184: Fax is 212-979-6526")
	void FaxOfRecord2184() {
		assertEquals("212-979-6526", customers.get(2183).getFax());
	}

	@Test
	@DisplayName("Record 2184: Email is edward@cubit.com")
	void EmailOfRecord2184() {
		assertEquals("edward@cubit.com", customers.get(2183).getEmail());
	}

	@Test
	@DisplayName("Record 2184: Web is http://www.edwardcubit.com")
	void WebOfRecord2184() {
		assertEquals("http://www.edwardcubit.com", customers.get(2183).getWeb());
	}
}
