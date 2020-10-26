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

@Tag("12")
class Record_4791 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4791: FirstName is James")
	void FirstNameOfRecord4791() {
		assertEquals("James", customers.get(4790).getFirstName());
	}

	@Test
	@DisplayName("Record 4791: LastName is Essix")
	void LastNameOfRecord4791() {
		assertEquals("Essix", customers.get(4790).getLastName());
	}

	@Test
	@DisplayName("Record 4791: Company is Ebsco Media Div Ebsco Ind Inc")
	void CompanyOfRecord4791() {
		assertEquals("Ebsco Media Div Ebsco Ind Inc", customers.get(4790).getCompany());
	}

	@Test
	@DisplayName("Record 4791: Address is 52 E Centre St")
	void AddressOfRecord4791() {
		assertEquals("52 E Centre St", customers.get(4790).getAddress());
	}

	@Test
	@DisplayName("Record 4791: City is Nutley")
	void CityOfRecord4791() {
		assertEquals("Nutley", customers.get(4790).getCity());
	}

	@Test
	@DisplayName("Record 4791: County is Essex")
	void CountyOfRecord4791() {
		assertEquals("Essex", customers.get(4790).getCounty());
	}

	@Test
	@DisplayName("Record 4791: State is NJ")
	void StateOfRecord4791() {
		assertEquals("NJ", customers.get(4790).getState());
	}

	@Test
	@DisplayName("Record 4791: ZIP is 7110")
	void ZIPOfRecord4791() {
		assertEquals("7110", customers.get(4790).getZIP());
	}

	@Test
	@DisplayName("Record 4791: Phone is 973-667-8068")
	void PhoneOfRecord4791() {
		assertEquals("973-667-8068", customers.get(4790).getPhone());
	}

	@Test
	@DisplayName("Record 4791: Fax is 973-667-6165")
	void FaxOfRecord4791() {
		assertEquals("973-667-6165", customers.get(4790).getFax());
	}

	@Test
	@DisplayName("Record 4791: Email is james@essix.com")
	void EmailOfRecord4791() {
		assertEquals("james@essix.com", customers.get(4790).getEmail());
	}

	@Test
	@DisplayName("Record 4791: Web is http://www.jamesessix.com")
	void WebOfRecord4791() {
		assertEquals("http://www.jamesessix.com", customers.get(4790).getWeb());
	}
}
